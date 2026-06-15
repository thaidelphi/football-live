package com.startapp.sdk.ads.banner.banner3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.j9;
import com.startapp.sdk.ads.banner.banner3d.Banner3DSize;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.json.RatingBar;
import com.startapp.y;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class Banner3DView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public TextView f22559a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f22560b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f22561c;

    /* renamed from: d  reason: collision with root package name */
    public RatingBar f22562d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f22563e;

    /* renamed from: f  reason: collision with root package name */
    public final Point f22564f;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum Template {
        /* JADX INFO: Fake field, exist only in values array */
        XS,
        S,
        M,
        L,
        XL
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends ShapeDrawable {
        public a(RoundRectShape roundRectShape) {
            super(roundRectShape);
        }

        @Override // android.graphics.drawable.ShapeDrawable
        public final void onDraw(Shape shape, Canvas canvas, Paint paint) {
            paint.setColor(-11363070);
            paint.setMaskFilter(new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.4f, 5.0f, 3.0f));
            super.onDraw(shape, canvas, paint);
        }
    }

    public Banner3DView(Context context) {
        super(context);
        a();
    }

    public final void a() {
        int i10;
        RelativeLayout.LayoutParams layoutParams;
        int ordinal;
        int ordinal2;
        Context context = getContext();
        Template template = Template.S;
        int i11 = this.f22564f.x;
        Banner3DSize.Size size = Banner3DSize.Size.SMALL;
        if (i11 > size.getSize().f22339a.x || this.f22564f.y > size.getSize().f22339a.y) {
            template = Template.M;
        }
        int i12 = this.f22564f.x;
        Banner3DSize.Size size2 = Banner3DSize.Size.MEDIUM;
        if (i12 > size2.getSize().f22339a.x || this.f22564f.y > size2.getSize().f22339a.y) {
            template = Template.L;
        }
        int i13 = this.f22564f.x;
        Banner3DSize.Size size3 = Banner3DSize.Size.LARGE;
        if (i13 > size3.getSize().f22339a.x || this.f22564f.y > size3.getSize().f22339a.y) {
            template = Template.XL;
        }
        setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.f22889h.p(), AdsCommonMetaData.f22889h.o()}));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int a10 = j9.a(context, 2);
        int round = Math.round(TypedValue.applyDimension(1, 3, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 4, context.getResources().getDisplayMetrics()));
        int round2 = Math.round(TypedValue.applyDimension(1, 5, context.getResources().getDisplayMetrics()));
        int round3 = Math.round(TypedValue.applyDimension(1, 6, context.getResources().getDisplayMetrics()));
        int round4 = Math.round(TypedValue.applyDimension(1, 8, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 10, context.getResources().getDisplayMetrics()));
        int round5 = Math.round(TypedValue.applyDimension(1, 20, context.getResources().getDisplayMetrics()));
        Math.round(TypedValue.applyDimension(1, 84, context.getResources().getDisplayMetrics()));
        int round6 = Math.round(TypedValue.applyDimension(1, 90, context.getResources().getDisplayMetrics()));
        setPadding(round2, 0, round2, 0);
        setTag(this);
        ImageView imageView = new ImageView(context);
        this.f22561c = imageView;
        imageView.setId(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(round6, round6);
        layoutParams2.addRule(15);
        this.f22561c.setLayoutParams(layoutParams2);
        TextView textView = new TextView(context);
        this.f22559a = textView;
        textView.setId(2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(y.a(17), 1);
        layoutParams3.addRule(14);
        this.f22559a.setLayoutParams(layoutParams3);
        this.f22559a.setTextColor(AdsCommonMetaData.f22889h.q().intValue());
        this.f22559a.setGravity(y.a(8388611));
        this.f22559a.setBackgroundColor(0);
        int ordinal3 = template.ordinal();
        if (ordinal3 == 0 || ordinal3 == 1) {
            this.f22559a.setTextSize(17.0f);
            this.f22559a.setPadding(round, 0, 0, a10);
            layoutParams3.width = j9.a(getContext(), (int) (this.f22564f.x * 0.55d));
        } else if (ordinal3 == 2) {
            this.f22559a.setTextSize(17.0f);
            this.f22559a.setPadding(round, 0, 0, a10);
            layoutParams3.width = j9.a(getContext(), (int) (this.f22564f.x * 0.65d));
        } else if (ordinal3 == 3 || ordinal3 == 4) {
            this.f22559a.setTextSize(22.0f);
            this.f22559a.setPadding(round, 0, 0, round2);
        }
        this.f22559a.setSingleLine(true);
        this.f22559a.setEllipsize(TextUtils.TruncateAt.END);
        j9.a(this.f22559a, AdsCommonMetaData.f22889h.r());
        TextView textView2 = new TextView(context);
        this.f22560b = textView2;
        textView2.setId(3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(y.a(17), 1);
        layoutParams4.addRule(3, 2);
        layoutParams4.setMargins(0, 0, 0, round2);
        this.f22560b.setLayoutParams(layoutParams4);
        this.f22560b.setTextColor(AdsCommonMetaData.f22889h.l().intValue());
        this.f22560b.setTextSize(18.0f);
        this.f22560b.setMaxLines(2);
        this.f22560b.setLines(2);
        this.f22560b.setSingleLine(false);
        this.f22560b.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f22560b.setHorizontallyScrolling(true);
        this.f22560b.setPadding(round, 0, 0, 0);
        RatingBar ratingBar = new RatingBar(getContext());
        this.f22562d = ratingBar;
        ratingBar.setId(5);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        int ordinal4 = template.ordinal();
        if (ordinal4 == 0 || ordinal4 == 1 || ordinal4 == 2) {
            layoutParams5.addRule(y.a(17), 1);
            layoutParams5.addRule(8, 1);
        } else if (ordinal4 == 3 || ordinal4 == 4) {
            layoutParams5.addRule(y.a(17), 2);
            layoutParams4.width = j9.a(getContext(), (int) (this.f22564f.x * 0.6d));
        } else {
            i10 = 0;
            layoutParams5.setMargins(round, round4, round, i10);
            this.f22562d.setLayoutParams(layoutParams5);
            this.f22563e = new TextView(context);
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            ordinal = template.ordinal();
            if (ordinal != 0 || ordinal == 1 || ordinal == 2) {
                this.f22563e.setTextSize(13.0f);
                layoutParams.addRule(y.a(17), 2);
                layoutParams.addRule(15);
            } else if (ordinal == 3) {
                layoutParams.addRule(y.a(17), 3);
                layoutParams.addRule(15);
                layoutParams.setMargins(round5, 0, 0, 0);
                this.f22563e.setTextSize(26.0f);
            } else if (ordinal == 4) {
                layoutParams.addRule(y.a(17), 3);
                layoutParams.addRule(15);
                layoutParams.setMargins(round5 * 7, 0, 0, 0);
                this.f22563e.setTextSize(26.0f);
            }
            this.f22563e.setPadding(round3, round3, round3, round3);
            this.f22563e.setLayoutParams(layoutParams);
            setButtonText(false);
            this.f22563e.setTextColor(-1);
            this.f22563e.setTypeface(null, 1);
            this.f22563e.setId(4);
            this.f22563e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
            this.f22563e.setBackgroundDrawable(new a(new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null)));
            addView(this.f22561c);
            addView(this.f22559a);
            ordinal2 = template.ordinal();
            if (ordinal2 != 0 || ordinal2 == 1 || ordinal2 == 2) {
                addView(this.f22563e);
            } else if (ordinal2 == 3 || ordinal2 == 4) {
                addView(this.f22563e);
                addView(this.f22560b);
            }
            addView(this.f22562d);
        }
        i10 = 0;
        layoutParams5.setMargins(round, round4, round, i10);
        this.f22562d.setLayoutParams(layoutParams5);
        this.f22563e = new TextView(context);
        layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        ordinal = template.ordinal();
        if (ordinal != 0) {
        }
        this.f22563e.setTextSize(13.0f);
        layoutParams.addRule(y.a(17), 2);
        layoutParams.addRule(15);
        this.f22563e.setPadding(round3, round3, round3, round3);
        this.f22563e.setLayoutParams(layoutParams);
        setButtonText(false);
        this.f22563e.setTextColor(-1);
        this.f22563e.setTypeface(null, 1);
        this.f22563e.setId(4);
        this.f22563e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        this.f22563e.setBackgroundDrawable(new a(new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null)));
        addView(this.f22561c);
        addView(this.f22559a);
        ordinal2 = template.ordinal();
        if (ordinal2 != 0) {
        }
        addView(this.f22563e);
        addView(this.f22562d);
    }

    public void setButtonText(boolean z10) {
        if (z10) {
            this.f22563e.setText("OPEN");
        } else {
            this.f22563e.setText("DOWNLOAD");
        }
    }

    public void setDescription(String str) {
        if (str != null) {
            if (str.compareTo("") != 0) {
                String[] a10 = a(str);
                String str2 = a10[0];
                String str3 = a10[1];
                String str4 = str3 != null ? a(str3)[0] : "";
                if (str.length() >= 110) {
                    str4 = str4 + "...";
                }
                this.f22560b.setText(str2 + "\n" + str4);
            }
        }
    }

    public void setImage(Bitmap bitmap) {
        this.f22561c.setImageBitmap(bitmap);
    }

    public void setRating(float f10) {
        try {
            this.f22562d.setRating(f10);
        } catch (NullPointerException unused) {
        }
    }

    public void setText(String str) {
        this.f22559a.setText(str);
    }

    public void setImage(int i10, int i11, int i12) {
        this.f22561c.setImageResource(i10);
        ViewGroup.LayoutParams layoutParams = this.f22561c.getLayoutParams();
        layoutParams.width = i11;
        layoutParams.height = i12;
        this.f22561c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, Point point) {
        super(context);
        this.f22564f = point;
        a();
    }

    public Banner3DView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public void setImage(Bitmap bitmap, int i10, int i11) {
        this.f22561c.setImageBitmap(bitmap);
        ViewGroup.LayoutParams layoutParams = this.f22561c.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        this.f22561c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a();
    }

    public static String[] a(String str) {
        boolean z10;
        String[] strArr = new String[2];
        if (str.length() > 55) {
            char[] charArray = str.substring(0, 55).toCharArray();
            int length = charArray.length - 1;
            int i10 = length - 1;
            while (true) {
                if (i10 <= 0) {
                    z10 = false;
                    break;
                } else if (charArray[i10] == ' ') {
                    z10 = true;
                    length = i10;
                    break;
                } else {
                    i10--;
                }
            }
            int i11 = z10 ? length : 55;
            strArr[0] = str.substring(0, i11);
            strArr[1] = str.substring(i11 + 1, str.length());
        } else {
            strArr[0] = str;
            strArr[1] = null;
        }
        return strArr;
    }
}
