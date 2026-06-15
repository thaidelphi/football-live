package com.ironsource;

import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface sf {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList<zb> f20654a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f20655b;

        /* renamed from: c  reason: collision with root package name */
        private int f20656c;

        /* renamed from: d  reason: collision with root package name */
        private Exception f20657d;

        public a(ArrayList<zb> arrayList) {
            this.f20655b = false;
            this.f20656c = -1;
            this.f20654a = arrayList;
        }

        a(ArrayList<zb> arrayList, int i10, boolean z10, Exception exc) {
            this.f20654a = arrayList;
            this.f20655b = z10;
            this.f20657d = exc;
            this.f20656c = i10;
        }

        public a a(int i10) {
            return new a(this.f20654a, i10, this.f20655b, this.f20657d);
        }

        public a a(Exception exc) {
            return new a(this.f20654a, this.f20656c, this.f20655b, exc);
        }

        public a a(boolean z10) {
            return new a(this.f20654a, this.f20656c, z10, this.f20657d);
        }

        public String a() {
            if (this.f20655b) {
                return "";
            }
            return "rc=" + this.f20656c + ", ex=" + this.f20657d;
        }

        public ArrayList<zb> b() {
            return this.f20654a;
        }

        public boolean c() {
            return this.f20655b;
        }

        public String toString() {
            return "EventSendResult{success=" + this.f20655b + ", responseCode=" + this.f20656c + ", exception=" + this.f20657d + '}';
        }
    }

    void a(a aVar);
}
