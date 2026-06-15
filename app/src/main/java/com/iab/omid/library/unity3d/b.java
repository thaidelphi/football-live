package com.iab.omid.library.unity3d;

import android.content.Context;
import com.iab.omid.library.unity3d.internal.f;
import com.iab.omid.library.unity3d.internal.h;
import com.iab.omid.library.unity3d.utils.e;
import com.iab.omid.library.unity3d.utils.g;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f16087a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return "1.4.9-Unity3d";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        h.c().a(context);
        com.iab.omid.library.unity3d.internal.b.g().a(context);
        com.iab.omid.library.unity3d.utils.a.a(context);
        com.iab.omid.library.unity3d.utils.c.a(context);
        e.a(context);
        f.b().a(context);
        com.iab.omid.library.unity3d.internal.a.a().a(context);
    }

    void a(boolean z10) {
        this.f16087a = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.f16087a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        g.a();
        com.iab.omid.library.unity3d.internal.a.a().d();
    }
}
