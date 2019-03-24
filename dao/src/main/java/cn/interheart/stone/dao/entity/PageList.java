package cn.interheart.stone.dao.entity;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class PageList<T> implements Serializable{
    private static final long serialVersionUID = 1L;
    private int pageIndex;
    private int pageSize;
    private long total;
    private List<T> rows;

    public PageList(List<T> list) {
        this(list, 8);
    }

    public PageList(List<T> list, int navigatePages) {

        if (list instanceof Page) {
            Page page = (Page)list;
            this.pageIndex = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.rows = page;
            this.total = page.getTotal();
        } else if (list instanceof Collection) {
            this.pageIndex = 1;
            this.pageSize = list.size();
            this.rows = list;
            this.total = (long)list.size();
        }


    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("PageInfo{");
        sb.append("pageIndex=").append(this.pageIndex);
        sb.append(", pageSize=").append(this.pageSize);
        sb.append(", total=").append(this.total);
        sb.append(", list=").append(this.rows);
        sb.append('}');
        return sb.toString();
    }
}

