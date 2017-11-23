package com.powersen.myshoppingcar;

import android.widget.ImageView;


public interface UpdateView {
    void update(boolean isAllSelected, int count, int price);
    void callBackImg(ImageView goodsImg);
}
