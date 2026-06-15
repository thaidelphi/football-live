package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import b3.t;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import f6.c;
import f6.e;
import f6.h;
import f6.r;
import java.util.Arrays;
import java.util.List;
import z2.g;
@Keep
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$getComponents$0(e eVar) {
        t.f((Context) eVar.a(Context.class));
        return t.c().g(a.f10413h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.e(g.class).h(LIBRARY_NAME).b(r.j(Context.class)).f(new h() { // from class: h6.a
            @Override // f6.h
            public final Object a(e eVar) {
                g lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(eVar);
                return lambda$getComponents$0;
            }
        }).d(), z6.h.b(LIBRARY_NAME, "18.1.7"));
    }
}
