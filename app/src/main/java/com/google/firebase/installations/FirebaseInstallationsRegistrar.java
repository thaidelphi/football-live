package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import f6.e0;
import f6.r;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
@Keep
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ r6.e lambda$getComponents$0(f6.e eVar) {
        return new c((c6.e) eVar.a(c6.e.class), eVar.e(o6.i.class), (ExecutorService) eVar.d(e0.a(e6.a.class, ExecutorService.class)), g6.i.a((Executor) eVar.d(e0.a(e6.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<f6.c<?>> getComponents() {
        return Arrays.asList(f6.c.e(r6.e.class).h(LIBRARY_NAME).b(r.j(c6.e.class)).b(r.h(o6.i.class)).b(r.i(e0.a(e6.a.class, ExecutorService.class))).b(r.i(e0.a(e6.b.class, Executor.class))).f(new f6.h() { // from class: r6.f
            @Override // f6.h
            public final Object a(f6.e eVar) {
                e lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(eVar);
                return lambda$getComponents$0;
            }
        }).d(), o6.h.a(), z6.h.b(LIBRARY_NAME, "17.1.3"));
    }
}
