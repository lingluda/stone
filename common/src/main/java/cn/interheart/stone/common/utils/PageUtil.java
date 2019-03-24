package cn.interheart.stone.common.utils;

/**
 * Created By victorrrr on 2017/8/18
 */
public class PageUtil<T> {

    public static Integer getStartRow(Integer currentPage, Integer pageSize, Integer totalCount) {
        int totalPage;
        if (currentPage < 1) {
            currentPage = 1;
        }
        //得到总页数
        if (totalCount % pageSize == 0) {
            totalPage = totalCount / pageSize;
        } else {
            totalPage = totalCount / pageSize + 1;
        }
        if (currentPage > totalPage) {
            currentPage = totalPage;
        }
        return (currentPage - 1) * pageSize;
    }
}
