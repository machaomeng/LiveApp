package com.jlkf.text.textapp.ui.home.adapter;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jlkf.text.textapp.R;

import java.util.List;

/**
 * 相册适配器
 */
public class PhotoAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public PhotoAdapter(@Nullable List<String> data) {
        super(R.layout.item_photo_adapter, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        Glide.with(mContext).load(item).apply(new RequestOptions().error(R.mipmap.ic_launcher)).into((ImageView) helper.getView(R.id.iv_picture));
    }
}
