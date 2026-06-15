package com.ironsource;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ec {

    /* renamed from: a  reason: collision with root package name */
    private String f17208a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f17209b;

    /* renamed from: c  reason: collision with root package name */
    private String f17210c;

    /* renamed from: d  reason: collision with root package name */
    private vf f17211d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f17212e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<Pair<String, String>> f17213f;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f17214a;

        /* renamed from: d  reason: collision with root package name */
        private vf f17217d;

        /* renamed from: b  reason: collision with root package name */
        private boolean f17215b = false;

        /* renamed from: c  reason: collision with root package name */
        private String f17216c = in.f17849b;

        /* renamed from: e  reason: collision with root package name */
        private boolean f17218e = false;

        /* renamed from: f  reason: collision with root package name */
        private ArrayList<Pair<String, String>> f17219f = new ArrayList<>();

        public a(String str) {
            this.f17214a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f17214a = str;
        }

        public a a(Pair<String, String> pair) {
            this.f17219f.add(pair);
            return this;
        }

        public a a(vf vfVar) {
            this.f17217d = vfVar;
            return this;
        }

        public a a(List<Pair<String, String>> list) {
            this.f17219f.addAll(list);
            return this;
        }

        public a a(boolean z10) {
            this.f17218e = z10;
            return this;
        }

        public ec a() {
            return new ec(this);
        }

        public a b() {
            this.f17216c = in.f17848a;
            return this;
        }

        public a b(boolean z10) {
            this.f17215b = z10;
            return this;
        }

        public a c() {
            this.f17216c = in.f17849b;
            return this;
        }
    }

    ec(a aVar) {
        this.f17212e = false;
        this.f17208a = aVar.f17214a;
        this.f17209b = aVar.f17215b;
        this.f17210c = aVar.f17216c;
        this.f17211d = aVar.f17217d;
        this.f17212e = aVar.f17218e;
        if (aVar.f17219f != null) {
            this.f17213f = new ArrayList<>(aVar.f17219f);
        }
    }

    public boolean a() {
        return this.f17209b;
    }

    public String b() {
        return this.f17208a;
    }

    public vf c() {
        return this.f17211d;
    }

    public ArrayList<Pair<String, String>> d() {
        return new ArrayList<>(this.f17213f);
    }

    public String e() {
        return this.f17210c;
    }

    public boolean f() {
        return this.f17212e;
    }
}
