package com.ironsource;

import com.ironsource.j3;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface x6 extends lm<Integer, Integer> {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21360a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f21361b = 3009;

        /* renamed from: c  reason: collision with root package name */
        public static final int f21362c = 3008;

        private a() {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f21363a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final int f21364b = 3002;

        /* renamed from: c  reason: collision with root package name */
        public static final int f21365c = 3005;

        /* renamed from: d  reason: collision with root package name */
        public static final int f21366d = 3300;

        /* renamed from: e  reason: collision with root package name */
        public static final int f21367e = 3503;

        private b() {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c implements x6 {
        public Integer a(int i10) throws IllegalArgumentException {
            int i11;
            if (i10 == 206) {
                i11 = 3503;
            } else if (i10 == 405) {
                i11 = 3009;
            } else if (i10 != 406) {
                switch (i10) {
                    case 101:
                        i11 = 83500;
                        break;
                    case 102:
                        i11 = 83510;
                        break;
                    case 103:
                        i11 = d.f21375h;
                        break;
                    case 104:
                        i11 = 83300;
                        break;
                    default:
                        switch (i10) {
                            case 109:
                                i11 = 88002;
                                break;
                            case 110:
                                i11 = 83004;
                                break;
                            case 111:
                                break;
                            case 112:
                                i11 = 3305;
                                break;
                            default:
                                switch (i10) {
                                    case j3.c.b.f17911b /* 201 */:
                                        i11 = 3002;
                                        break;
                                    case j3.c.b.f17912c /* 202 */:
                                        i11 = 3005;
                                        break;
                                    case j3.c.b.f17913d /* 203 */:
                                        i11 = 3300;
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Unknown event code: " + i10);
                                }
                        }
                    case 105:
                        i11 = 83302;
                        break;
                }
            } else {
                i11 = 3008;
            }
            return Integer.valueOf(i11);
        }

        @Override // com.ironsource.lm
        public /* bridge */ /* synthetic */ Integer a(Integer num) {
            return a(num.intValue());
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f21368a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final int f21369b = 83500;

        /* renamed from: c  reason: collision with root package name */
        public static final int f21370c = 83510;

        /* renamed from: d  reason: collision with root package name */
        public static final int f21371d = 83300;

        /* renamed from: e  reason: collision with root package name */
        public static final int f21372e = 83302;

        /* renamed from: f  reason: collision with root package name */
        public static final int f21373f = 83004;

        /* renamed from: g  reason: collision with root package name */
        public static final int f21374g = 88002;

        /* renamed from: h  reason: collision with root package name */
        public static final int f21375h = 83301;

        /* renamed from: i  reason: collision with root package name */
        public static final int f21376i = 83302;

        /* renamed from: j  reason: collision with root package name */
        public static final int f21377j = 3305;

        private d() {
        }
    }
}
