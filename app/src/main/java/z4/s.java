package z4;

import a5.a0;
import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.cc;
import com.ironsource.j3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import z4.f;
/* compiled from: DefaultBandwidthMeter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class s implements f, s0 {

    /* renamed from: p  reason: collision with root package name */
    public static final y5.q<Long> f33615p = y5.q.s(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* renamed from: q  reason: collision with root package name */
    public static final y5.q<Long> f33616q = y5.q.s(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* renamed from: r  reason: collision with root package name */
    public static final y5.q<Long> f33617r = y5.q.s(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* renamed from: s  reason: collision with root package name */
    public static final y5.q<Long> f33618s = y5.q.s(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* renamed from: t  reason: collision with root package name */
    public static final y5.q<Long> f33619t = y5.q.s(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* renamed from: u  reason: collision with root package name */
    public static final y5.q<Long> f33620u = y5.q.s(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* renamed from: v  reason: collision with root package name */
    private static s f33621v;

    /* renamed from: a  reason: collision with root package name */
    private final y5.r<Integer, Long> f33622a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a.C0397a f33623b;

    /* renamed from: c  reason: collision with root package name */
    private final q0 f33624c;

    /* renamed from: d  reason: collision with root package name */
    private final a5.d f33625d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f33626e;

    /* renamed from: f  reason: collision with root package name */
    private int f33627f;

    /* renamed from: g  reason: collision with root package name */
    private long f33628g;

    /* renamed from: h  reason: collision with root package name */
    private long f33629h;

    /* renamed from: i  reason: collision with root package name */
    private int f33630i;

    /* renamed from: j  reason: collision with root package name */
    private long f33631j;

    /* renamed from: k  reason: collision with root package name */
    private long f33632k;

    /* renamed from: l  reason: collision with root package name */
    private long f33633l;

    /* renamed from: m  reason: collision with root package name */
    private long f33634m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f33635n;

    /* renamed from: o  reason: collision with root package name */
    private int f33636o;

    /* compiled from: DefaultBandwidthMeter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f33637a;

        /* renamed from: b  reason: collision with root package name */
        private Map<Integer, Long> f33638b;

        /* renamed from: c  reason: collision with root package name */
        private int f33639c;

        /* renamed from: d  reason: collision with root package name */
        private a5.d f33640d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f33641e;

        public b(Context context) {
            this.f33637a = context == null ? null : context.getApplicationContext();
            this.f33638b = b(a5.p0.L(context));
            this.f33639c = 2000;
            this.f33640d = a5.d.f412a;
            this.f33641e = true;
        }

        private static Map<Integer, Long> b(String str) {
            int[] k10 = s.k(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            y5.q<Long> qVar = s.f33615p;
            hashMap.put(2, qVar.get(k10[0]));
            hashMap.put(3, s.f33616q.get(k10[1]));
            hashMap.put(4, s.f33617r.get(k10[2]));
            hashMap.put(5, s.f33618s.get(k10[3]));
            hashMap.put(10, s.f33619t.get(k10[4]));
            hashMap.put(9, s.f33620u.get(k10[5]));
            hashMap.put(7, qVar.get(k10[0]));
            return hashMap;
        }

        public s a() {
            return new s(this.f33637a, this.f33638b, this.f33639c, this.f33640d, this.f33641e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] k(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c10 = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c10 = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    c10 = '\f';
                    break;
                }
                break;
            case IronSourceConstants.IS_CHECK_READY_FALSE /* 2102 */:
                if (str.equals("AW")) {
                    c10 = '\r';
                    break;
                }
                break;
            case IronSourceConstants.IS_CHECK_CAPPED_TRUE /* 2103 */:
                if (str.equals("AX")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c10 = 15;
                    break;
                }
                break;
            case IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR /* 2111 */:
                if (str.equals("BA")) {
                    c10 = 16;
                    break;
                }
                break;
            case IronSourceConstants.IS_CALLBACK_AD_DISPLAYED /* 2112 */:
                if (str.equals("BB")) {
                    c10 = 17;
                    break;
                }
                break;
            case IronSourceConstants.IS_CALLBACK_AD_CLICKED /* 2114 */:
                if (str.equals("BD")) {
                    c10 = 18;
                    break;
                }
                break;
            case IronSourceConstants.IS_CALLBACK_AD_INFO_CHANGED /* 2115 */:
                if (str.equals("BE")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c10 = 25;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c10 = 26;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c10 = 27;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c10 = 28;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c10 = 29;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c10 = 30;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c10 = 31;
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c10 = '!';
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c10 = '#';
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c10 = '$';
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c10 = '%';
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c10 = '&';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c10 = '(';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c10 = ')';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c10 = '*';
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c10 = '+';
                    break;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    c10 = ',';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c10 = '-';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c10 = '.';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c10 = '/';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c10 = '0';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c10 = '1';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c10 = '2';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c10 = '3';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c10 = '4';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c10 = '5';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c10 = '6';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c10 = '7';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c10 = '8';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c10 = '9';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c10 = ':';
                    break;
                }
                break;
            case IronSourceConstants.IS_INSTANCE_INIT_FAILED /* 2206 */:
                if (str.equals("EC")) {
                    c10 = ';';
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c10 = '<';
                    break;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    c10 = cc.T;
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c10 = '>';
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c10 = '?';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c10 = '@';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c10 = 'A';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c10 = 'B';
                    break;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    c10 = 'C';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c10 = 'D';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c10 = 'E';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c10 = 'F';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c10 = 'G';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c10 = 'H';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c10 = 'I';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c10 = 'J';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c10 = 'K';
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c10 = 'L';
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c10 = 'M';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c10 = 'N';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c10 = 'O';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c10 = 'P';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c10 = 'Q';
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c10 = 'R';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c10 = 'S';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c10 = 'T';
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c10 = 'U';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c10 = 'V';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c10 = 'W';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c10 = 'X';
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c10 = 'Y';
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c10 = 'Z';
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c10 = '[';
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c10 = '\\';
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c10 = ']';
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c10 = '^';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c10 = '_';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c10 = '`';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c10 = 'a';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c10 = 'b';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c10 = 'c';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c10 = 'd';
                    break;
                }
                break;
            case 2346:
                if (str.equals(IronSourceConstants.INTERSTITIAL_EVENT_TYPE)) {
                    c10 = 'e';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c10 = 'f';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c10 = 'g';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c10 = 'h';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c10 = 'i';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c10 = 'j';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c10 = 'k';
                    break;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    c10 = 'l';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c10 = 'm';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c10 = 'n';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c10 = 'o';
                    break;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    c10 = 'p';
                    break;
                }
                break;
            case 2405:
                if (str.equals("KP")) {
                    c10 = 'q';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c10 = 'r';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c10 = 's';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c10 = 't';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c10 = 'u';
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c10 = 'v';
                    break;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    c10 = 'w';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c10 = 'x';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c10 = 'y';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c10 = 'z';
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c10 = '{';
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c10 = '|';
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c10 = '}';
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c10 = '~';
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c10 = 127;
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c10 = 128;
                    break;
                }
                break;
            case 2452:
                if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                    c10 = 129;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c10 = 130;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c10 = 131;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c10 = 132;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c10 = 133;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c10 = 134;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c10 = 135;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c10 = 136;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c10 = 137;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c10 = 138;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c10 = 139;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c10 = 140;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c10 = 141;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c10 = 142;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c10 = 143;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c10 = 144;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c10 = 145;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c10 = 146;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c10 = 147;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c10 = 148;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c10 = 149;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c10 = 150;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c10 = 151;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c10 = 152;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c10 = 153;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c10 = 154;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c10 = 155;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c10 = 156;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c10 = 157;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c10 = 158;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c10 = 159;
                    break;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    c10 = 160;
                    break;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    c10 = 161;
                    break;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c10 = 162;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c10 = 163;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c10 = 164;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c10 = 165;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c10 = 166;
                    break;
                }
                break;
            case 2551:
                if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_PG)) {
                    c10 = 167;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c10 = 168;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c10 = 169;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c10 = 170;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c10 = 171;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c10 = 172;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c10 = 173;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c10 = 174;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c10 = 175;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c10 = 176;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c10 = 177;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c10 = 178;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c10 = 179;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c10 = 180;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c10 = 181;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c10 = 182;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c10 = 183;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c10 = 184;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c10 = 185;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c10 = 186;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c10 = 187;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c10 = 188;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c10 = 189;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c10 = 190;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c10 = 191;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c10 = 192;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c10 = 193;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c10 = 194;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c10 = 195;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c10 = 196;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c10 = 197;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c10 = 198;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c10 = 199;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c10 = 200;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c10 = 201;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c10 = 202;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c10 = 203;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c10 = 204;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c10 = 205;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c10 = 206;
                    break;
                }
                break;
            case 2679:
                if (str.equals("TK")) {
                    c10 = 207;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c10 = 208;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c10 = 209;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c10 = 210;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c10 = 211;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c10 = 212;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c10 = 213;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c10 = 214;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c10 = 215;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c10 = 216;
                    break;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    c10 = 217;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c10 = 218;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c10 = 219;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c10 = 220;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c10 = 221;
                    break;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    c10 = 222;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c10 = 223;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c10 = 224;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c10 = 225;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c10 = 226;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c10 = 227;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c10 = 228;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c10 = 229;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c10 = 230;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c10 = 231;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c10 = 232;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c10 = 233;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c10 = 234;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c10 = 235;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c10 = 236;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 26:
            case 29:
            case 'I':
            case 'O':
            case 'p':
            case 't':
            case 'x':
            case 223:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 4, 4, 4, 0};
            case 2:
            case 'P':
                return new int[]{4, 3, 3, 4, 2, 2};
            case 3:
                return new int[]{2, 4, 1, 2, 2, 2};
            case 4:
                return new int[]{0, 2, 0, 3, 2, 2};
            case 5:
            case 231:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{4, 4, 3, 2, 2, 2};
            case '\b':
            case '>':
            case 188:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
            case 'l':
            case 210:
            case 220:
                return new int[]{2, 1, 1, 1, 2, 2};
            case '\n':
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
                return new int[]{1, 0, 1, 1, 0, 0};
            case '\f':
                return new int[]{0, 1, 1, 1, 2, 0};
            case '\r':
                return new int[]{1, 3, 4, 4, 2, 2};
            case 14:
            case 'y':
            case 144:
            case 171:
            case 192:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 'K':
            case 128:
            case 169:
            case 194:
            case 211:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 16:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 17:
            case '8':
            case 'E':
            case 'N':
                return new int[]{0, 2, 0, 0, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 3, 2, 2};
            case 19:
                return new int[]{0, 1, 4, 4, 3, 2};
            case 20:
                return new int[]{4, 3, 4, 3, 2, 2};
            case 21:
            case 145:
            case 190:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 2, 1, 3, 4, 2};
            case 23:
            case '[':
            case 'o':
            case 134:
            case 154:
            case 185:
            case j3.c.b.f17913d /* 203 */:
            case 224:
            case 232:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 3, 3, 2, 2};
            case 25:
            case '2':
            case 222:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 27:
            case '1':
                return new int[]{2, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 3, 2, 2, 2};
            case 30:
                return new int[]{4, 4, 2, 2, 2, 2};
            case 31:
                return new int[]{3, 1, 3, 2, 2, 2};
            case ' ':
                return new int[]{3, 2, 1, 0, 2, 2};
            case '!':
                return new int[]{0, 1, 2, 3, 2, 2};
            case '\"':
                return new int[]{2, 4, 2, 1, 2, 2};
            case '#':
                return new int[]{0, 2, 2, 2, 3, 2};
            case '$':
                return new int[]{4, 2, 3, 2, 2, 2};
            case '%':
            case 'n':
                return new int[]{4, 2, 4, 2, 2, 2};
            case '&':
            case '=':
            case 'W':
                return new int[]{3, 4, 3, 3, 2, 2};
            case '\'':
                return new int[]{0, 0, 0, 1, 0, 2};
            case '(':
            case ':':
            case '{':
                return new int[]{3, 4, 4, 4, 2, 2};
            case ')':
            case 166:
                return new int[]{2, 2, 2, 1, 2, 2};
            case '*':
            case '_':
                return new int[]{1, 2, 2, 2, 3, 2};
            case '+':
                return new int[]{3, 3, 3, 3, 2, 2};
            case ',':
                return new int[]{2, 0, 1, 1, 3, 2};
            case '-':
                return new int[]{2, 3, 4, 3, 2, 2};
            case '.':
                return new int[]{2, 3, 4, 4, 2, 2};
            case '/':
            case '6':
            case 200:
            case j3.c.b.f17916g /* 206 */:
            case 208:
                return new int[]{4, 3, 4, 4, 2, 2};
            case '0':
                return new int[]{2, 1, 0, 0, 2, 2};
            case '3':
            case 's':
                return new int[]{1, 0, 0, 0, 0, 2};
            case '4':
            case 158:
                return new int[]{0, 0, 2, 0, 1, 2};
            case '5':
                return new int[]{0, 1, 2, 2, 2, 3};
            case '7':
                return new int[]{0, 0, 3, 2, 0, 2};
            case '9':
                return new int[]{3, 4, 4, 4, 4, 2};
            case ';':
                return new int[]{2, 3, 2, 1, 2, 2};
            case '<':
            case 'e':
            case 127:
            case 174:
            case 186:
            case 215:
                return new int[]{0, 0, 0, 0, 0, 2};
            case '?':
            case '^':
                return new int[]{0, 1, 1, 1, 2, 2};
            case '@':
                return new int[]{4, 3, 3, 1, 2, 2};
            case 'A':
                return new int[]{0, 0, 0, 3, 0, 2};
            case 'B':
                return new int[]{3, 1, 2, 2, 2, 2};
            case 'C':
            case 'k':
            case 'q':
                return new int[]{3, 2, 2, 2, 2, 2};
            case 'D':
                return new int[]{4, 2, 4, 1, 2, 2};
            case 'F':
                return new int[]{1, 2, 3, 1, 0, 2};
            case 'G':
            case 204:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 'H':
                return new int[]{0, 0, 1, 1, 1, 1};
            case 'J':
                return new int[]{1, 1, 1, 2, 2, 2};
            case 'L':
            case 226:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 'M':
            case 152:
            case 228:
                return new int[]{3, 3, 3, 2, 2, 2};
            case 'Q':
                return new int[]{4, 3, 4, 2, 2, 2};
            case 'R':
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 'S':
                return new int[]{4, 2, 1, 4, 2, 2};
            case 'T':
            case 'Z':
            case 189:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 'U':
                return new int[]{2, 3, 2, 2, 2, 2};
            case 'V':
            case 165:
                return new int[]{1, 2, 4, 4, 4, 2};
            case 'X':
                return new int[]{3, 2, 2, 1, 2, 2};
            case 'Y':
                return new int[]{0, 1, 2, 3, 2, 0};
            case '\\':
                return new int[]{0, 0, 0, 1, 3, 2};
            case ']':
                return new int[]{3, 1, 2, 2, 3, 2};
            case '`':
            case 217:
                return new int[]{0, 2, 1, 1, 2, 2};
            case 'a':
                return new int[]{1, 1, 3, 2, 3, 3};
            case 'b':
            case 135:
            case 214:
            case 229:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 'c':
                return new int[]{3, 2, 2, 3, 2, 2};
            case 'd':
                return new int[]{3, 0, 1, 1, 4, 1};
            case 'f':
                return new int[]{0, 0, 0, 1, 1, 2};
            case 'g':
            case 233:
                return new int[]{4, 2, 2, 3, 2, 2};
            case 'h':
                return new int[]{2, 4, 3, 2, 2, 2};
            case 'i':
                return new int[]{2, 1, 1, 2, 2, 2};
            case 'j':
                return new int[]{0, 1, 1, 2, 2, 4};
            case 'm':
                return new int[]{2, 1, 4, 2, 2, 2};
            case 'r':
                return new int[]{0, 1, 1, 3, 4, 4};
            case 'u':
                return new int[]{2, 1, 2, 2, 2, 2};
            case 'v':
                return new int[]{1, 2, 1, 3, 2, 2};
            case 'w':
                return new int[]{3, 3, 2, 4, 2, 2};
            case 'z':
                return new int[]{3, 1, 3, 3, 4, 2};
            case '|':
                return new int[]{3, 3, 2, 2, 2, 2};
            case '}':
                return new int[]{0, 0, 0, 0, 2, 2};
            case '~':
                return new int[]{1, 0, 3, 2, 1, 4};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 130:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 131:
            case 179:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 132:
                return new int[]{2, 0, 0, 1, 2, 2};
            case 133:
            case 177:
                return new int[]{1, 2, 1, 2, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 137:
            case 167:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 138:
                return new int[]{2, 4, 2, 3, 2, 2};
            case 139:
                return new int[]{2, 0, 1, 2, 2, 2};
            case IronSourceConstants.USING_CACHE_FOR_INIT_EVENT /* 140 */:
            case 141:
                return new int[]{0, 2, 4, 4, 2, 2};
            case 143:
            case 236:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 146:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 147:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 148:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 149:
                return new int[]{2, 4, 3, 4, 2, 2};
            case IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED /* 150 */:
                return new int[]{1, 0, 3, 1, 3, 2};
            case 151:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 153:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 155:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 156:
            case 164:
            case 198:
                return new int[]{2, 3, 3, 3, 2, 2};
            case 157:
                return new int[]{0, 2, 2, 3, 0, 3};
            case 159:
                return new int[]{2, 2, 4, 3, 2, 2};
            case 160:
            case 161:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 162:
            case 170:
                return new int[]{1, 1, 2, 2, 4, 2};
            case 163:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 168:
                return new int[]{2, 1, 3, 3, 3, 0};
            case 172:
                return new int[]{2, 0, 2, 1, 2, 1};
            case 173:
                return new int[]{3, 4, 1, 2, 2, 2};
            case 175:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 176:
                return new int[]{2, 4, 4, 4, 4, 2};
            case 178:
                return new int[]{0, 0, 1, 2, 1, 2};
            case 180:
                return new int[]{1, 0, 0, 0, 4, 3};
            case 181:
                return new int[]{3, 4, 2, 0, 2, 2};
            case 182:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 183:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 184:
            case 209:
                return new int[]{4, 2, 1, 1, 2, 2};
            case 187:
                return new int[]{1, 1, 2, 2, 2, 1};
            case 191:
            case 218:
                return new int[]{3, 3, 4, 3, 2, 2};
            case 193:
                return new int[]{4, 4, 4, 3, 2, 2};
            case 195:
                return new int[]{2, 4, 3, 0, 2, 2};
            case 196:
                return new int[]{4, 3, 2, 3, 2, 2};
            case 197:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 199:
            case j3.c.b.f17912c /* 202 */:
                return new int[]{1, 2, 1, 0, 2, 2};
            case j3.c.b.f17911b /* 201 */:
                return new int[]{3, 3, 3, 4, 2, 2};
            case j3.c.b.f17915f /* 205 */:
                return new int[]{0, 2, 2, 3, 3, 4};
            case 207:
                return new int[]{2, 2, 2, 4, 2, 2};
            case 212:
                return new int[]{1, 1, 0, 0, 2, 2};
            case 213:
                return new int[]{1, 4, 1, 3, 2, 2};
            case 216:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 219:
                return new int[]{1, 0, 2, 2, 3, 1};
            case 221:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 225:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 227:
                return new int[]{0, 3, 3, 4, 2, 2};
            case 230:
                return new int[]{3, 1, 3, 1, 2, 2};
            case 234:
                return new int[]{3, 2, 2, 1, 1, 2};
            case 235:
                return new int[]{3, 3, 4, 2, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    private long l(int i10) {
        Long l10 = this.f33622a.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = this.f33622a.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public static synchronized s m(Context context) {
        s sVar;
        synchronized (s.class) {
            if (f33621v == null) {
                f33621v = new b(context).a();
            }
            sVar = f33621v;
        }
        return sVar;
    }

    private static boolean n(p pVar, boolean z10) {
        return z10 && !pVar.d(8);
    }

    private void o(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f33634m) {
            return;
        }
        this.f33634m = j11;
        this.f33623b.c(i10, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void p(int i10) {
        int i11 = this.f33630i;
        if (i11 == 0 || this.f33626e) {
            if (this.f33635n) {
                i10 = this.f33636o;
            }
            if (i11 == i10) {
                return;
            }
            this.f33630i = i10;
            if (i10 != 1 && i10 != 0 && i10 != 8) {
                this.f33633l = l(i10);
                long b10 = this.f33625d.b();
                o(this.f33627f > 0 ? (int) (b10 - this.f33628g) : 0, this.f33629h, this.f33633l);
                this.f33628g = b10;
                this.f33629h = 0L;
                this.f33632k = 0L;
                this.f33631j = 0L;
                this.f33624c.i();
            }
        }
    }

    @Override // z4.f
    public /* synthetic */ long a() {
        return d.a(this);
    }

    @Override // z4.f
    public void b(Handler handler, f.a aVar) {
        a5.a.e(handler);
        a5.a.e(aVar);
        this.f33623b.b(handler, aVar);
    }

    @Override // z4.s0
    public synchronized void c(l lVar, p pVar, boolean z10) {
        if (n(pVar, z10)) {
            if (this.f33627f == 0) {
                this.f33628g = this.f33625d.b();
            }
            this.f33627f++;
        }
    }

    @Override // z4.f
    public s0 d() {
        return this;
    }

    @Override // z4.s0
    public synchronized void e(l lVar, p pVar, boolean z10, int i10) {
        if (n(pVar, z10)) {
            this.f33629h += i10;
        }
    }

    @Override // z4.f
    public synchronized long f() {
        return this.f33633l;
    }

    @Override // z4.s0
    public synchronized void g(l lVar, p pVar, boolean z10) {
        if (n(pVar, z10)) {
            a5.a.f(this.f33627f > 0);
            long b10 = this.f33625d.b();
            int i10 = (int) (b10 - this.f33628g);
            this.f33631j += i10;
            long j10 = this.f33632k;
            long j11 = this.f33629h;
            this.f33632k = j10 + j11;
            if (i10 > 0) {
                this.f33624c.c((int) Math.sqrt(j11), (((float) j11) * 8000.0f) / i10);
                if (this.f33631j >= 2000 || this.f33632k >= 524288) {
                    this.f33633l = this.f33624c.f(0.5f);
                }
                o(i10, this.f33629h, this.f33633l);
                this.f33628g = b10;
                this.f33629h = 0L;
            }
            this.f33627f--;
        }
    }

    @Override // z4.s0
    public void h(l lVar, p pVar, boolean z10) {
    }

    @Deprecated
    public s() {
        this(null, y5.r.j(), 2000, a5.d.f412a, false);
    }

    private s(Context context, Map<Integer, Long> map, int i10, a5.d dVar, boolean z10) {
        this.f33622a = y5.r.c(map);
        this.f33623b = new f.a.C0397a();
        this.f33624c = new q0(i10);
        this.f33625d = dVar;
        this.f33626e = z10;
        if (context != null) {
            a5.a0 d10 = a5.a0.d(context);
            int f10 = d10.f();
            this.f33630i = f10;
            this.f33633l = l(f10);
            d10.i(new a0.c() { // from class: z4.r
                @Override // a5.a0.c
                public final void a(int i11) {
                    s.this.p(i11);
                }
            });
            return;
        }
        this.f33630i = 0;
        this.f33633l = l(0);
    }
}
