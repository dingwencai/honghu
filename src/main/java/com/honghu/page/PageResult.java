package com.honghu.page;

import java.util.List;

public class PageResult {
    private int pageNum;
    private int pageSize;
    private long totalSize;
    private int totalPages;
    private List<?> content;

    public PageResult() {
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    public void setTotalSize(long totalSize) {
        this.totalSize = totalSize;
    }

    public int getTotalPages() {
        return this.totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<?> getContent() {
        return this.content;
    }

    public void setContent(List<?> content) {
        this.content = content;
    }
}
