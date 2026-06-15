package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.Gs  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC0811Gs {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C0810Gr>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C0810Gr>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C0810Gr A01(C1900k1 c1900k1, AbstractC2058md abstractC2058md, int i10, InterfaceC0808Gp interfaceC0808Gp) {
        C0810Gr c0810Gr = new C0810Gr(c1900k1, abstractC2058md, c1900k1.A02().A0A(), i10);
        c0810Gr.A0b(interfaceC0808Gp);
        c0810Gr.A0X();
        A01.put(abstractC2058md.A0r(), new WeakReference<>(c0810Gr));
        return c0810Gr;
    }

    public static C0810Gr A02(String str) {
        WeakReference<C0810Gr> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC2058md abstractC2058md, C0810Gr c0810Gr) {
        A01.put(abstractC2058md.A0r(), new WeakReference<>(c0810Gr));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
