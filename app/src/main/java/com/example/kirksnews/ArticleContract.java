package com.example.kirksnews;

import android.provider.BaseColumns;

public class ArticleContract {
    private ArticleContract() {} // Private constructor to prevent instantiation

    public static class ArticleEntry implements BaseColumns {
        public static final String TABLE_NAME = "articles";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_CONTENT = "content";
        public static final String COLUMN_IMAGE_URL = "image_url";
    }
}
