package z1;

import android.graphics.Bitmap;
import android.os.Build;
import com.ironsource.b9;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: SizeConfigStrategy.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n implements l {

    /* renamed from: d  reason: collision with root package name */
    private static final Bitmap.Config[] f33451d;

    /* renamed from: e  reason: collision with root package name */
    private static final Bitmap.Config[] f33452e;

    /* renamed from: f  reason: collision with root package name */
    private static final Bitmap.Config[] f33453f;

    /* renamed from: g  reason: collision with root package name */
    private static final Bitmap.Config[] f33454g;

    /* renamed from: h  reason: collision with root package name */
    private static final Bitmap.Config[] f33455h;

    /* renamed from: a  reason: collision with root package name */
    private final c f33456a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final h<b, Bitmap> f33457b = new h<>();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f33458c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f33459a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f33459a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33459a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33459a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33459a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b implements m {

        /* renamed from: a  reason: collision with root package name */
        private final c f33460a;

        /* renamed from: b  reason: collision with root package name */
        int f33461b;

        /* renamed from: c  reason: collision with root package name */
        private Bitmap.Config f33462c;

        public b(c cVar) {
            this.f33460a = cVar;
        }

        @Override // z1.m
        public void a() {
            this.f33460a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f33461b = i10;
            this.f33462c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f33461b == bVar.f33461b && s2.k.c(this.f33462c, bVar.f33462c);
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f33461b * 31;
            Bitmap.Config config = this.f33462c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return n.i(this.f33461b, this.f33462c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c extends d<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // z1.d
        /* renamed from: d */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b b10 = b();
            b10.b(i10, config);
            return b10;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f33451d = configArr;
        f33452e = configArr;
        f33453f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f33454g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f33455h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void g(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> k10 = k(bitmap.getConfig());
        Integer num2 = (Integer) k10.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                k10.remove(num);
                return;
            } else {
                k10.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + a(bitmap) + ", this: " + this);
    }

    private b h(int i10, Bitmap.Config config) {
        Bitmap.Config[] j10;
        b e8 = this.f33456a.e(i10, config);
        for (Bitmap.Config config2 : j(config)) {
            Integer ceilingKey = k(config2).ceilingKey(Integer.valueOf(i10));
            if (ceilingKey != null && ceilingKey.intValue() <= i10 * 8) {
                if (ceilingKey.intValue() == i10) {
                    if (config2 == null) {
                        if (config == null) {
                            return e8;
                        }
                    } else if (config2.equals(config)) {
                        return e8;
                    }
                }
                this.f33456a.c(e8);
                return this.f33456a.e(ceilingKey.intValue(), config2);
            }
        }
        return e8;
    }

    static String i(int i10, Bitmap.Config config) {
        return b9.i.f16696d + i10 + "](" + config + ")";
    }

    private static Bitmap.Config[] j(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f33452e;
        }
        int i10 = a.f33459a[config.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return i10 != 4 ? new Bitmap.Config[]{config} : f33455h;
                }
                return f33454g;
            }
            return f33453f;
        }
        return f33451d;
    }

    private NavigableMap<Integer, Integer> k(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f33458c.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f33458c.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // z1.l
    public String a(Bitmap bitmap) {
        return i(s2.k.g(bitmap), bitmap.getConfig());
    }

    @Override // z1.l
    public Bitmap b() {
        Bitmap f10 = this.f33457b.f();
        if (f10 != null) {
            g(Integer.valueOf(s2.k.g(f10)), f10);
        }
        return f10;
    }

    @Override // z1.l
    public void c(Bitmap bitmap) {
        b e8 = this.f33456a.e(s2.k.g(bitmap), bitmap.getConfig());
        this.f33457b.d(e8, bitmap);
        NavigableMap<Integer, Integer> k10 = k(bitmap.getConfig());
        Integer num = (Integer) k10.get(Integer.valueOf(e8.f33461b));
        k10.put(Integer.valueOf(e8.f33461b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // z1.l
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        b h10 = h(s2.k.f(i10, i11, config), config);
        Bitmap a10 = this.f33457b.a(h10);
        if (a10 != null) {
            g(Integer.valueOf(h10.f33461b), a10);
            a10.reconfigure(i10, i11, config);
        }
        return a10;
    }

    @Override // z1.l
    public String e(int i10, int i11, Bitmap.Config config) {
        return i(s2.k.f(i10, i11, config), config);
    }

    @Override // z1.l
    public int f(Bitmap bitmap) {
        return s2.k.g(bitmap);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f33457b);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f33458c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f33458c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
