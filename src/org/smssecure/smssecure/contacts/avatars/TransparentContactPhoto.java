package org.smssecure.smssecure.contacts.avatars;

import android.content.Context;
import android.graphics.drawable.Drawable;

import com.makeramen.roundedimageview.RoundedDrawable;

public class TransparentContactPhoto implements ContactPhoto {

  TransparentContactPhoto() {}

  @Override
  public Drawable asDrawable(Context context, int background) {
    return RoundedDrawable.fromDrawable(context.getResources().getDrawable(android.R.color.transparent));
  }
}
