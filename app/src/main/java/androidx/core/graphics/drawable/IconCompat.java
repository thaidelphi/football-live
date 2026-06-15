package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.util.i;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.ironsource.b9;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f2620k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f2621a;

    /* renamed from: b  reason: collision with root package name */
    Object f2622b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f2623c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f2624d;

    /* renamed from: e  reason: collision with root package name */
    public int f2625e;

    /* renamed from: f  reason: collision with root package name */
    public int f2626f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2627g;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f2628h;

    /* renamed from: i  reason: collision with root package name */
    public String f2629i;

    /* renamed from: j  reason: collision with root package name */
    public String f2630j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a {
        static IconCompat a(Object obj) {
            i.f(obj);
            int d10 = d(obj);
            if (d10 != 2) {
                if (d10 != 4) {
                    if (d10 != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.f2622b = obj;
                        return iconCompat;
                    }
                    return IconCompat.c(e(obj));
                }
                return IconCompat.f(e(obj));
            }
            return IconCompat.h(null, c(obj), b(obj));
        }

        static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon resource", e8);
                return 0;
            } catch (NoSuchMethodException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            }
        }

        static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon package", e8);
                return null;
            } catch (NoSuchMethodException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            }
        }

        static int d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e8);
                return -1;
            } catch (NoSuchMethodException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            }
        }

        static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon uri", e8);
                return null;
            } catch (NoSuchMethodException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            }
        }

        static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        static Icon g(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f2621a) {
                case -1:
                    return (Icon) iconCompat.f2622b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f2622b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.k(), iconCompat.f2625e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f2622b, iconCompat.f2625e, iconCompat.f2626f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f2622b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT >= 26) {
                        createWithBitmap = b.b((Bitmap) iconCompat.f2622b);
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.b((Bitmap) iconCompat.f2622b, false));
                        break;
                    }
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        createWithBitmap = d.a(iconCompat.m());
                        break;
                    } else if (context != null) {
                        InputStream n10 = iconCompat.n(context);
                        if (n10 == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m());
                        } else if (i10 >= 26) {
                            createWithBitmap = b.b(BitmapFactory.decodeStream(n10));
                            break;
                        } else {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.b(BitmapFactory.decodeStream(n10), false));
                            break;
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m());
                    }
            }
            ColorStateList colorStateList = iconCompat.f2627g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f2628h;
            if (mode != IconCompat.f2620k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f2621a = -1;
        this.f2623c = null;
        this.f2624d = null;
        this.f2625e = 0;
        this.f2626f = 0;
        this.f2627g = null;
        this.f2628h = f2620k;
        this.f2629i = null;
    }

    public static IconCompat a(Icon icon) {
        return a.a(icon);
    }

    static Bitmap b(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat c(Uri uri) {
        androidx.core.util.d.c(uri);
        return d(uri.toString());
    }

    public static IconCompat d(String str) {
        androidx.core.util.d.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f2622b = str;
        return iconCompat;
    }

    public static IconCompat e(Bitmap bitmap) {
        androidx.core.util.d.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f2622b = bitmap;
        return iconCompat;
    }

    public static IconCompat f(Uri uri) {
        androidx.core.util.d.c(uri);
        return g(uri.toString());
    }

    public static IconCompat g(String str) {
        androidx.core.util.d.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f2622b = str;
        return iconCompat;
    }

    public static IconCompat h(Resources resources, String str, int i10) {
        androidx.core.util.d.c(str);
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f2625e = i10;
            if (resources != null) {
                try {
                    iconCompat.f2622b = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f2622b = str;
            }
            iconCompat.f2630j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    private static String s(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap i() {
        int i10 = this.f2621a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f2622b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i10 == 1) {
            return (Bitmap) this.f2622b;
        } else {
            if (i10 == 5) {
                return b((Bitmap) this.f2622b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int j() {
        int i10 = this.f2621a;
        if (i10 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i10 == 2) {
                return this.f2625e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        return a.b(this.f2622b);
    }

    public String k() {
        int i10 = this.f2621a;
        if (i10 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i10 == 2) {
                String str = this.f2630j;
                if (str != null && !TextUtils.isEmpty(str)) {
                    return this.f2630j;
                }
                return ((String) this.f2622b).split(":", -1)[0];
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return a.c(this.f2622b);
    }

    public int l() {
        int i10 = this.f2621a;
        return (i10 != -1 || Build.VERSION.SDK_INT < 23) ? i10 : a.d(this.f2622b);
    }

    public Uri m() {
        int i10 = this.f2621a;
        if (i10 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i10 != 4 && i10 != 6) {
                throw new IllegalStateException("called getUri() on " + this);
            }
            return Uri.parse((String) this.f2622b);
        }
        return a.e(this.f2622b);
    }

    public InputStream n(Context context) {
        Uri m7 = m();
        String scheme = m7.getScheme();
        if (!"content".equals(scheme) && !b9.h.f16640b.equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f2622b));
            } catch (FileNotFoundException e8) {
                Log.w("IconCompat", "Unable to load image from path: " + m7, e8);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(m7);
        } catch (Exception e10) {
            Log.w("IconCompat", "Unable to load image from URI: " + m7, e10);
            return null;
        }
    }

    public void o() {
        this.f2628h = PorterDuff.Mode.valueOf(this.f2629i);
        switch (this.f2621a) {
            case -1:
                Parcelable parcelable = this.f2624d;
                if (parcelable != null) {
                    this.f2622b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f2624d;
                if (parcelable2 != null) {
                    this.f2622b = parcelable2;
                    return;
                }
                byte[] bArr = this.f2623c;
                this.f2622b = bArr;
                this.f2621a = 3;
                this.f2625e = 0;
                this.f2626f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2623c, Charset.forName("UTF-16"));
                this.f2622b = str;
                if (this.f2621a == 2 && this.f2630j == null) {
                    this.f2630j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2622b = this.f2623c;
                return;
        }
    }

    public void p(boolean z10) {
        this.f2629i = this.f2628h.name();
        switch (this.f2621a) {
            case -1:
                if (!z10) {
                    this.f2624d = (Parcelable) this.f2622b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z10) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f2622b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f2623c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f2624d = (Parcelable) this.f2622b;
                return;
            case 2:
                this.f2623c = ((String) this.f2622b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2623c = (byte[]) this.f2622b;
                return;
            case 4:
            case 6:
                this.f2623c = this.f2622b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @Deprecated
    public Icon q() {
        return r(null);
    }

    public Icon r(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public String toString() {
        if (this.f2621a == -1) {
            return String.valueOf(this.f2622b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(s(this.f2621a));
        switch (this.f2621a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2622b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2622b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2630j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(j())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2625e);
                if (this.f2626f != 0) {
                    sb.append(" off=");
                    sb.append(this.f2626f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2622b);
                break;
        }
        if (this.f2627g != null) {
            sb.append(" tint=");
            sb.append(this.f2627g);
        }
        if (this.f2628h != f2620k) {
            sb.append(" mode=");
            sb.append(this.f2628h);
        }
        sb.append(")");
        return sb.toString();
    }

    IconCompat(int i10) {
        this.f2621a = -1;
        this.f2623c = null;
        this.f2624d = null;
        this.f2625e = 0;
        this.f2626f = 0;
        this.f2627g = null;
        this.f2628h = f2620k;
        this.f2629i = null;
        this.f2621a = i10;
    }
}
