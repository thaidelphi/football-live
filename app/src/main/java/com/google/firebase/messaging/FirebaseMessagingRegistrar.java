package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(f6.e eVar) {
        return new FirebaseMessaging((c6.e) eVar.a(c6.e.class), (p6.a) eVar.a(p6.a.class), eVar.e(z6.i.class), eVar.e(o6.j.class), (r6.e) eVar.a(r6.e.class), (z2.g) eVar.a(z2.g.class), (n6.d) eVar.a(n6.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<f6.c<?>> getComponents() {
        return Arrays.asList(f6.c.e(FirebaseMessaging.class).h(LIBRARY_NAME).b(f6.r.j(c6.e.class)).b(f6.r.g(p6.a.class)).b(f6.r.h(z6.i.class)).b(f6.r.h(o6.j.class)).b(f6.r.g(z2.g.class)).b(f6.r.j(r6.e.class)).b(f6.r.j(n6.d.class)).f(new f6.h() { // from class: com.google.firebase.messaging.x
            @Override // f6.h
            public final Object a(f6.e eVar) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(eVar);
                return lambda$getComponents$0;
            }
        }).c().d(), z6.h.b(LIBRARY_NAME, "23.2.0"));
    }
}
