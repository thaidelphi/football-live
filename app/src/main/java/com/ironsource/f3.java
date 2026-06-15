package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class f3 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f17363b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int f17364c = -1;

    /* renamed from: a  reason: collision with root package name */
    private final l1 f17365a;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int a10;
            a10 = l8.b.a(Integer.valueOf(((LevelPlayAdSize) t11).getWidth()), Integer.valueOf(((LevelPlayAdSize) t10).getWidth()));
            return a10;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f17366a;

        public c(Comparator comparator) {
            this.f17366a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int a10;
            int compare = this.f17366a.compare(t10, t11);
            if (compare != 0) {
                return compare;
            }
            a10 = l8.b.a(Integer.valueOf(((LevelPlayAdSize) t11).getHeight()), Integer.valueOf(((LevelPlayAdSize) t10).getHeight()));
            return a10;
        }
    }

    public f3(l1 adSizeTools) {
        kotlin.jvm.internal.n.f(adSizeTools, "adSizeTools");
        this.f17365a = adSizeTools;
    }

    private final int a(Integer num, Context context) {
        if (num != null && num.intValue() < 0) {
            IronLog.API.info(l1.a(this.f17365a, "Width is invalid, screen width will be used", (String) null, 2, (Object) null));
        } else if (num != null) {
            return num.intValue();
        }
        return bb.f16738a.b(context);
    }

    private final List<LevelPlayAdSize> a() {
        List<LevelPlayAdSize> I;
        I = j8.y.I(this.f17365a.b(), new c(new b()));
        return I;
    }

    private final List<LevelPlayAdSize> a(List<LevelPlayAdSize> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
            if (levelPlayAdSize.getHeight() <= i10 && levelPlayAdSize.getWidth() <= i11) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final LevelPlayAdSize a(Context context, Integer num) {
        IronLog ironLog;
        l1 l1Var;
        String str;
        int i10;
        LevelPlayAdSize levelPlayAdSize;
        Object B;
        kotlin.jvm.internal.n.f(context, "context");
        if (this.f17365a.d()) {
            Integer b10 = this.f17365a.b(context);
            if (b10 != null) {
                int intValue = b10.intValue();
                int a10 = a(num, context);
                int a11 = this.f17365a.a(a10);
                List<LevelPlayAdSize> a12 = a();
                for (LevelPlayAdSize levelPlayAdSize2 : a(a12, intValue, a10)) {
                    if (levelPlayAdSize2.getWidth() <= a10 && (levelPlayAdSize2.getHeight() <= a11 || a11 == -1)) {
                        a11 = Math.max(a11, levelPlayAdSize2.getHeight());
                        break;
                    }
                }
                levelPlayAdSize2 = null;
                if (levelPlayAdSize2 == null) {
                    B = j8.y.B(a12);
                    int height = ((LevelPlayAdSize) B).getHeight();
                    i10 = height;
                    levelPlayAdSize = LevelPlayAdSize.Companion.createCustomSize(a10, height);
                } else {
                    i10 = a11;
                    levelPlayAdSize = levelPlayAdSize2;
                }
                IronLog.INTERNAL.info(l1.a(this.f17365a, "Adaptive: " + a10 + 'x' + i10 + " Fallback: " + levelPlayAdSize, (String) null, 2, (Object) null));
                return new LevelPlayAdSize(a10, i10, com.ironsource.mediationsdk.l.f18875f, true, levelPlayAdSize);
            }
            ironLog = IronLog.API;
            l1Var = this.f17365a;
            str = "Error getting max current orientation banner height";
        } else {
            ironLog = IronLog.API;
            l1Var = this.f17365a;
            str = "The SDK must be successfully initialized to create an Adaptive Ad Size";
        }
        ironLog.error(l1.a(l1Var, str, (String) null, 2, (Object) null));
        return null;
    }
}
