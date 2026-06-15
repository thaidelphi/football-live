package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class DA {
    public static String[] A00 = {"0dslaS9HQNor4584P2qJWDauGUJuCUyD", "hmu58uVtuBegxtguAmxWdcC", "RnpWwwftYVF7ZcI60v", "9ipL7H1AQ7hrzmKFvXE", "pZ3KzhX3bLT6KZ2Vo7aJYVVuuWb7wszV", "0AfAa8bIuU", "cY7ucT44sLUlO9uXsqd9BA7lLs0feoWz", "ELBhZY2lRpRyd6u07AMv4seAD2bUSLiq"};

    public static Bitmap A00(C1900k1 c1900k1, Bitmap bitmap, int i10) throws RSRuntimeException {
        RenderScript renderScript = null;
        Allocation allocation = null;
        Allocation output = null;
        ScriptIntrinsicBlur scriptIntrinsicBlur = null;
        try {
            renderScript = RenderScript.create(c1900k1);
            renderScript.setMessageHandler(new RenderScript.RSMessageHandler());
            allocation = Allocation.createFromBitmap(renderScript, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            output = Allocation.createTyped(renderScript, allocation.getType());
            scriptIntrinsicBlur = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
            scriptIntrinsicBlur.setInput(allocation);
            scriptIntrinsicBlur.setRadius(i10);
            scriptIntrinsicBlur.forEach(output);
            output.copyTo(bitmap);
            return bitmap;
        } finally {
            if (renderScript != null) {
                renderScript.destroy();
            }
            if (allocation != null) {
                allocation.destroy();
            }
            if (output != null) {
                output.destroy();
            }
            if (scriptIntrinsicBlur != null) {
                scriptIntrinsicBlur.destroy();
            }
        }
    }

    public static Bitmap A01(C1900k1 c1900k1, Bitmap bitmap, int i10, int i11) {
        int width = bitmap.getWidth() / i11;
        int height = bitmap.getHeight() / i11;
        if (width != 0 && height != 0) {
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(1.0f / i11, 1.0f / i11);
            Paint paint = new Paint();
            paint.setFlags(3);
            paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            try {
                createBitmap = A00(c1900k1, createBitmap, i10);
                if (i11 != 1) {
                    int height2 = bitmap.getWidth();
                    int width2 = bitmap.getHeight();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, height2, width2, true);
                    if (A00[0].charAt(31) != 121) {
                        A00[7] = "0rCXq5ZtodXnzNKgqAgAvAA6fcN2Rviw";
                        createBitmap.recycle();
                        return createScaledBitmap;
                    }
                    throw new RuntimeException();
                }
                return createBitmap;
            } catch (RSRuntimeException unused) {
                return new C1780i1().A02(createBitmap, i10);
            }
        }
        return null;
    }
}
