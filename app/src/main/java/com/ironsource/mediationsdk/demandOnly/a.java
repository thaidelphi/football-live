package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.m5;
import j8.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface a {

    /* renamed from: com.ironsource.mediationsdk.demandOnly.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class C0226a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final List<m5> f18607a;

        public C0226a() {
            this(null, 1, null);
        }

        public C0226a(List<m5> waterfall) {
            kotlin.jvm.internal.n.f(waterfall, "waterfall");
            this.f18607a = waterfall;
        }

        public /* synthetic */ C0226a(List list, int i10, kotlin.jvm.internal.h hVar) {
            this((i10 & 1) != 0 ? new ArrayList() : list);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public m5 a(String instanceName) {
            Object obj;
            kotlin.jvm.internal.n.f(instanceName, "instanceName");
            Iterator<T> it = this.f18607a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.n.a(((m5) obj).c(), instanceName)) {
                    break;
                }
            }
            return (m5) obj;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public List<m5> a() {
            return this.f18607a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public String b() {
            Object v10;
            if (this.f18607a.isEmpty()) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append('1');
            v10 = y.v(this.f18607a);
            sb.append(((m5) v10).c());
            return sb.toString();
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public m5 get(int i10) {
            if (i10 < 0 || i10 >= this.f18607a.size()) {
                return null;
            }
            return this.f18607a.get(i10);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.a
        public boolean isEmpty() {
            return this.f18607a.isEmpty();
        }
    }

    m5 a(String str);

    List<m5> a();

    String b();

    m5 get(int i10);

    boolean isEmpty();
}
