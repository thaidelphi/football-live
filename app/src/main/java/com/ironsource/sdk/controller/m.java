package com.ironsource.sdk.controller;

import com.ironsource.eh;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface m {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class a implements m {

        /* renamed from: a  reason: collision with root package name */
        private final String f20380a;

        /* renamed from: b  reason: collision with root package name */
        private final String f20381b;

        /* renamed from: c  reason: collision with root package name */
        private final String f20382c;

        /* renamed from: d  reason: collision with root package name */
        private final String f20383d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall) {
            this(funToCall, null, null, null, 14, null);
            kotlin.jvm.internal.n.f(funToCall, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall, String str) {
            this(funToCall, str, null, null, 12, null);
            kotlin.jvm.internal.n.f(funToCall, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall, String str, String str2) {
            this(funToCall, str, str2, null, 8, null);
            kotlin.jvm.internal.n.f(funToCall, "funToCall");
        }

        public a(String funToCall, String str, String str2, String str3) {
            kotlin.jvm.internal.n.f(funToCall, "funToCall");
            this.f20380a = funToCall;
            this.f20381b = str;
            this.f20382c = str2;
            this.f20383d = str3;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, int i10, kotlin.jvm.internal.h hVar) {
            this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
        }

        @Override // com.ironsource.sdk.controller.m
        public String a() {
            StringBuilder sb = new StringBuilder();
            sb.append("SSA_CORE.SDKController.runFunction('" + this.f20380a);
            String str = this.f20381b;
            boolean z10 = false;
            if (!(str == null || str.length() == 0)) {
                sb.append("?parameters=" + this.f20381b);
            }
            String str2 = this.f20382c;
            if (!(str2 == null || str2.length() == 0)) {
                sb.append("','" + this.f20382c);
            }
            String str3 = this.f20383d;
            if (str3 == null || str3.length() == 0) {
                z10 = true;
            }
            if (!z10) {
                sb.append("','" + this.f20383d);
            }
            sb.append("');");
            String sb2 = sb.toString();
            kotlin.jvm.internal.n.e(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b implements m {

        /* renamed from: a  reason: collision with root package name */
        private int f20384a;

        /* renamed from: b  reason: collision with root package name */
        private String f20385b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(m jsMethod, int i10) {
            this(jsMethod.a(), i10);
            kotlin.jvm.internal.n.f(jsMethod, "jsMethod");
        }

        public b(String script, int i10) {
            kotlin.jvm.internal.n.f(script, "script");
            this.f20385b = script;
            this.f20384a = i10;
        }

        @Override // com.ironsource.sdk.controller.m
        public String a() {
            String str = "try{" + this.f20385b + "}catch(e){" + ((this.f20384a != eh.d.MODE_0.a() && (this.f20384a < eh.d.MODE_1.a() || this.f20384a > eh.d.MODE_3.a())) ? "empty" : "console.log(\"JS exception: \" + JSON.stringify(e));") + "}";
            kotlin.jvm.internal.n.e(str, "StringBuilder()\n        …}\")\n          .toString()");
            return str;
        }
    }

    String a();
}
