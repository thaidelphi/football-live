package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.lm;
import com.ironsource.ob;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface o extends ob<String> {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final String f18783a;

        public a(String rowAdm) {
            kotlin.jvm.internal.n.f(rowAdm, "rowAdm");
            this.f18783a = rowAdm;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o
        public <T> T a(lm<String, T> mapper) {
            kotlin.jvm.internal.n.f(mapper, "mapper");
            return mapper.a(this.f18783a);
        }

        @Override // com.ironsource.ob
        /* renamed from: b */
        public String a() {
            return this.f18783a;
        }
    }

    <T> T a(lm<String, T> lmVar);
}
