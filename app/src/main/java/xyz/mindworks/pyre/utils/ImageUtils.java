package xyz.mindworks.pyre.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageUtils {

    public static void loadImageFromUrl(Context context, String url, ImageView imageView) {
        Glide.with(context).load(url).into(imageView);
    }

}