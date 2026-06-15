package com.ironsource;

import com.ironsource.j3;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public interface nj extends lm<Integer, Integer> {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19409a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f19410b = 2201;

        /* renamed from: c  reason: collision with root package name */
        public static final int f19411c = 2203;

        /* renamed from: d  reason: collision with root package name */
        public static final int f19412d = 2005;

        /* renamed from: e  reason: collision with root package name */
        public static final int f19413e = 2210;

        /* renamed from: f  reason: collision with root package name */
        public static final int f19414f = 2006;

        /* renamed from: g  reason: collision with root package name */
        public static final int f19415g = 2204;

        /* renamed from: h  reason: collision with root package name */
        public static final int f19416h = 2507;

        /* renamed from: i  reason: collision with root package name */
        public static final int f19417i = 2211;

        /* renamed from: j  reason: collision with root package name */
        public static final int f19418j = 2212;

        private a() {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19419a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final int f19420b = 2002;

        /* renamed from: c  reason: collision with root package name */
        public static final int f19421c = 2003;

        /* renamed from: d  reason: collision with root package name */
        public static final int f19422d = 2200;

        /* renamed from: e  reason: collision with root package name */
        public static final int f19423e = 2503;

        /* renamed from: f  reason: collision with root package name */
        public static final int f19424f = 2300;

        private b() {
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class c implements nj {
        public Integer a(int i10) throws IllegalArgumentException {
            int i11;
            if (i10 == 206) {
                i11 = 2503;
            } else if (i10 == 401) {
                i11 = 2201;
            } else if (i10 == 410) {
                i11 = 2211;
            } else if (i10 != 411) {
                switch (i10) {
                    case 101:
                        i11 = 82500;
                        break;
                    case 102:
                        i11 = 82510;
                        break;
                    case 103:
                        i11 = 82301;
                        break;
                    case 104:
                        i11 = 82300;
                        break;
                    case 105:
                        i11 = 82002;
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
                                i11 = 82302;
                                break;
                            case 112:
                                i11 = d.f19434j;
                                break;
                            default:
                                switch (i10) {
                                    case j3.c.b.f17911b /* 201 */:
                                        i11 = 2002;
                                        break;
                                    case j3.c.b.f17912c /* 202 */:
                                        i11 = 2003;
                                        break;
                                    case j3.c.b.f17913d /* 203 */:
                                        i11 = 2200;
                                        break;
                                    case 204:
                                        i11 = 2300;
                                        break;
                                    default:
                                        switch (i10) {
                                            case j3.a.b.f17898c /* 403 */:
                                                i11 = 2203;
                                                break;
                                            case j3.a.b.f17899d /* 404 */:
                                                i11 = 2005;
                                                break;
                                            case j3.a.b.f17900e /* 405 */:
                                                i11 = 2210;
                                                break;
                                            case j3.a.b.f17901f /* 406 */:
                                                i11 = 2006;
                                                break;
                                            case j3.a.b.f17902g /* 407 */:
                                                i11 = 2204;
                                                break;
                                            case j3.a.b.f17903h /* 408 */:
                                                i11 = 2507;
                                                break;
                                            default:
                                                throw new IllegalArgumentException("Unknown event code: " + i10);
                                        }
                                }
                        }
                }
            } else {
                i11 = 2212;
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
        public static final d f19425a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final int f19426b = 82500;

        /* renamed from: c  reason: collision with root package name */
        public static final int f19427c = 82510;

        /* renamed from: d  reason: collision with root package name */
        public static final int f19428d = 82300;

        /* renamed from: e  reason: collision with root package name */
        public static final int f19429e = 82002;

        /* renamed from: f  reason: collision with root package name */
        public static final int f19430f = 83004;

        /* renamed from: g  reason: collision with root package name */
        public static final int f19431g = 88002;

        /* renamed from: h  reason: collision with root package name */
        public static final int f19432h = 82301;

        /* renamed from: i  reason: collision with root package name */
        public static final int f19433i = 82302;

        /* renamed from: j  reason: collision with root package name */
        public static final int f19434j = 82076;

        private d() {
        }
    }
}
