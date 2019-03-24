package cn.interheart.stone.common.utils;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/15.
 */
public class ExcelUtil {

    /**
     * xlsx 文件导入
     * @param is
     * @param clzss
     * @return list<Object>
     */
    public static List<?> importExcel(InputStream is, Class<?> clzss) {

        List<Object> list = new ArrayList<>();
        if (is != null && clzss != null) {
            try {
                XSSFWorkbook sxwb = new XSSFWorkbook(is);

                Field fields[] = clzss.getDeclaredFields();
                for (int numSheet = 0; numSheet < sxwb.getNumberOfSheets(); numSheet++) {
                    XSSFSheet xssfSheet = sxwb.getSheetAt(numSheet);
                    if (xssfSheet == null) {
                        continue;
                    }
                    for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
                        XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                        if (xssfRow == null) {
                            continue;
                        }
                        Object obj = Class.forName(clzss.getName().toString()).newInstance();
                        for (int i = 0; i < fields.length; i++) {
                            Field field = getFiled(fields, i);
                            XSSFCell cell = xssfRow.getCell(i);
                            if (cell == null || getCellValue(cell) == null || getCellValue(cell).equals("")) {
                                continue;
                            }
                            String value;
                            if (field.getType().toString().contains("String")) {
                                field.set(obj, getCellValue(cell));
                            } else if (field.getType().toString().contains("Integer")) {
                                value = getCellValue(cell);
                                if (value != null) {
                                    field.set(obj, (int) Double.parseDouble(value));
                                }
                            } else if (field.getType().toString().contains("boolean")) {
                                value = getCellValue(cell);
                                if (value != null) {
                                    field.set(obj, Boolean.parseBoolean(getCellValue(cell)));
                                }
                            } else if (field.getType().toString().contains("Double")) {
                                value = getCellValue(cell);
                                if (value != null) {
                                    field.set(obj, Double.parseDouble(value));
                                }
                            } else if (field.getType().toString().contains("Date")) {
                                field.set(obj, getCellValueDate(cell));
                            } else if (field.getType().toString().contains("short")) {
                                value = getCellValue(cell);
                                if (value != null) {
                                    field.set(obj, (short) Double.parseDouble(value));
                                }
                            } else {
                                field.set(obj, getCellValue(cell));
                            }
                            cell = null;
                        }
                        list.add(obj);
                        xssfRow = null;
                    }
                }
                sxwb.close();
            } catch (IOException | IllegalArgumentException | IllegalAccessException | InstantiationException | ClassNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        }
        return list;
    }

    private static Field getFiled(Field[] fs, int i) {
        Field f = fs[i];
        if (!f.isAccessible()) {
            f.setAccessible(true);
        }
        return f;
    }


    private static Date getCellValueDate(XSSFCell cell) {
        if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
            return HSSFDateUtil.getJavaDate(cell.getNumericCellValue());
        } else {
            return null;
        }
    }

    private static String getCellValue(XSSFCell cell) {
        if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
            cell.setCellType(XSSFCell.CELL_TYPE_STRING);
        }
        if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
            return cell.getStringCellValue();
        } else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
            return cell.getNumericCellValue() + "";
        } else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
            return String.valueOf(cell.getBooleanCellValue());
        } else {
            return null;
        }
    }


    /**
     * 导出Excel
     * @param heads  头列表
     * @param values 值集合
     * @return
     */
    public static void exportExcel(String[] heads, ArrayList<ArrayList<Object>> values,OutputStream stream) throws Exception {
        // 第一步，创建一个webbook，对应一个Excel文件
        HSSFWorkbook wb = new HSSFWorkbook();
        // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet sheet = wb.createSheet("sheet1");
        // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
        HSSFRow row = sheet.createRow((int) 0);
        // 第四步，创建单元格，并设置值表头 设置表头居中
        HSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
        HSSFFont font = wb.createFont();
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);//粗体显示
        style.setFont( font);
        for (int i=0;i<heads.length;i++) {
            HSSFCell cell = row.createCell((short)i);
            cell.setCellValue(heads[i]);
            cell.setCellStyle(style);
        }
        for (int i = 0; i < values.size(); i++) {
            row = sheet.createRow((int) i + 1);
            ArrayList<Object> value=values.get(i);
            for(int c=0;c<value.size();c++) {
                row.createCell((short)c).setCellValue((value.get(c)+""));
            }
        }
        wb.write(stream);
    }
}
