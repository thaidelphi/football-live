package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.ads.internal.context.Repairable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.facebook.ads.redexgen.X.k1  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1900k1 extends AnonymousClass85 {
    public static String[] A06 = {"4Fl94EIzOk67aYUPduHJ8UazEL", "sAhktSZOOrm35xxj8Imdq8RPkj", "oRYwVa3KjTvntAfrBK1sqTqE8vcnrhu1", "DAigVkrFkMuOUy14T2FK5zmWgvJcIn3a", "an5oIaHMQLp81wCZBnKMJTBSx7KtQFJf", "wEWpxEoKGSO43ttKCSegU3t35jPnkl3s", "WpWdxAQuBweGThqHfmbUTgqTG7", "dWX8I2VlCkDjmK6jHvJYkvPP690yaesv"};
    public WeakReference<Activity> A00;
    public WeakHashMap<Repairable, Boolean> A01;
    public final AnonymousClass82 A02;
    public final AtomicReference<AnonymousClass81> A03;
    public final AtomicReference<Object> A04;
    public final AtomicReference<InterfaceC04311f> A05;

    public C1900k1(Activity activity, AnonymousClass87 anonymousClass87, InterfaceC04311f interfaceC04311f) {
        super(activity.getApplicationContext(), anonymousClass87);
        this.A01 = new WeakHashMap<>();
        this.A05 = new AtomicReference<>();
        this.A03 = new AtomicReference<>();
        this.A02 = new AnonymousClass82();
        this.A04 = new AtomicReference<>();
        this.A05.set(interfaceC04311f);
        this.A00 = new WeakReference<>(activity);
    }

    public C1900k1(Context context, AnonymousClass87 anonymousClass87, InterfaceC04311f interfaceC04311f) {
        super(context.getApplicationContext(), anonymousClass87);
        this.A01 = new WeakHashMap<>();
        this.A05 = new AtomicReference<>();
        this.A03 = new AtomicReference<>();
        this.A02 = new AnonymousClass82();
        this.A04 = new AtomicReference<>();
        this.A05.set(interfaceC04311f);
        Activity A00 = A00(context);
        if (A00 != null) {
            this.A00 = new WeakReference<>(A00);
        } else {
            this.A00 = new WeakReference<>(null);
        }
    }

    public static Activity A00(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if ((context instanceof C1900k1) && ((C1900k1) context).A0E() != null) {
                return ((C1900k1) context).A0E();
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public final Activity A0E() {
        return this.A00.get();
    }

    public InterfaceC04311f A0F() {
        InterfaceC04311f funnel = this.A05.get();
        if (funnel == null) {
            return new C2102nL();
        }
        return funnel;
    }

    public final AnonymousClass81 A0G() {
        return this.A03.get();
    }

    public final AnonymousClass82 A0H() {
        return this.A02;
    }

    public final Object A0I() {
        return this.A04.get();
    }

    public final void A0J(Activity activity) {
        this.A00 = new WeakReference<>(activity);
    }

    public final void A0K(InterfaceC04311f interfaceC04311f) {
        this.A05.set(interfaceC04311f);
    }

    public final void A0L(C1900k1 c1900k1) {
        c1900k1.A01.putAll(this.A01);
        this.A01 = c1900k1.A01;
    }

    public final void A0M(C1900k1 c1900k1) {
        A0K(c1900k1.A0F());
        A0D(c1900k1.A0C());
        A0N(c1900k1.A0G());
    }

    public final void A0N(AnonymousClass81 anonymousClass81) {
        this.A03.set(anonymousClass81);
    }

    public final void A0O(Repairable repairable) {
        this.A01.put(repairable, true);
    }

    public final void A0P(Object obj) {
        this.A04.set(obj);
    }

    public final void A0Q(Throwable th) {
        Iterator<Map.Entry<Repairable, Boolean>> it = this.A01.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A06;
            if (strArr[4].charAt(18) == strArr[2].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "cq4W2mN05Su2gaFDi5CYFjM7nJ";
            strArr2[6] = "g7MgkZWMqMCaiMVBRzNoHUUy7c";
            if (hasNext) {
                it.next().getKey().repair(th);
            } else {
                return;
            }
        }
    }
}
