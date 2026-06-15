package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class q7 {

    /* renamed from: a  reason: collision with root package name */
    private static final DateFormat f8494a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b  reason: collision with root package name */
    private static final Random f8495b = new Random(System.currentTimeMillis());

    public static void a(i7 i7Var, AppLovinAdLoadListener appLovinAdLoadListener, j7 j7Var, int i10, com.applovin.impl.sdk.j jVar) {
        if (jVar != null) {
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i10);
            }
            Set a10 = a(i7Var, jVar);
            if (CollectionUtils.isEmpty(a10)) {
                return;
            }
            a(a10, j7Var, jVar);
            return;
        }
        throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
    }

    public static boolean b(e7 e7Var) {
        r7 n12;
        List g10;
        return (e7Var == null || (n12 = e7Var.n1()) == null || (g10 = n12.g()) == null || g10.isEmpty()) ? false : true;
    }

    public static j7 c(e7 e7Var) {
        if (b(e7Var) || a(e7Var)) {
            return null;
        }
        return j7.GENERAL_WRAPPER_ERROR;
    }

    private static String b() {
        DateFormat dateFormat = f8494a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    public static boolean a(e7 e7Var) {
        h7 e12;
        m7 e8;
        if (e7Var == null || (e12 = e7Var.e1()) == null || (e8 = e12.e()) == null) {
            return false;
        }
        return e8.c() != null || StringUtils.isValidString(e8.b());
    }

    public static boolean b(f8 f8Var) {
        if (f8Var != null) {
            return f8Var.b("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    public static Uri a(String str, long j10, Uri uri, j7 j7Var, com.applovin.impl.sdk.j jVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String num = Integer.toString(j7Var.b());
                String replace = str.replace("[ERRORCODE]", num).replace("[REASON]", num);
                if (j10 >= 0) {
                    replace = replace.replace("[CONTENTPLAYHEAD]", a(j10));
                }
                if (uri != null) {
                    replace = replace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(replace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
            } catch (Throwable th) {
                jVar.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.n I = jVar.I();
                    I.a("VastUtils", "Unable to replace macros in URL string " + str, th);
                }
                jVar.D().a("VastUtils", th);
                return null;
            }
        }
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.I().b("VastUtils", "Unable to replace macros in invalid URL string.");
        }
        return null;
    }

    private static String a(long j10) {
        if (j10 > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long hours = timeUnit.toHours(j10);
            long minutes = timeUnit.toMinutes(j10);
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j10 % timeUnit2.toSeconds(1L)));
        }
        return "00:00:00.000";
    }

    private static String a() {
        return Integer.toString(f8495b.nextInt(89999999) + 10000000);
    }

    public static void a(Set set, com.applovin.impl.sdk.j jVar) {
        a(set, -1L, (Uri) null, j7.UNSPECIFIED, jVar);
    }

    public static void a(Set set, j7 j7Var, com.applovin.impl.sdk.j jVar) {
        a(set, -1L, (Uri) null, j7Var, jVar);
    }

    public static void a(Set set, long j10, Uri uri, j7 j7Var, com.applovin.impl.sdk.j jVar) {
        if (jVar != null) {
            if (set == null || set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                o7 o7Var = (o7) it.next();
                Uri a10 = a(o7Var.c(), j10, uri, j7Var, jVar);
                if (a10 != null) {
                    jVar.W().a(com.applovin.impl.sdk.network.d.b().d(a10.toString()).a(false).b(o7Var.d()).a(), false);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
    }

    public static void a(f8 f8Var, Map map, i7 i7Var, com.applovin.impl.sdk.j jVar) {
        List<f8> a10;
        if (jVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (f8Var == null) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("VastUtils", "Unable to render event trackers; null node provided");
            }
        } else if (map == null) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("VastUtils", "Unable to render event trackers; null event trackers provided");
            }
        } else {
            f8 c10 = f8Var.c("TrackingEvents");
            if (c10 == null || (a10 = c10.a("Tracking")) == null) {
                return;
            }
            for (f8 f8Var2 : a10) {
                String str = (String) f8Var2.a().get("event");
                if (StringUtils.isValidString(str)) {
                    o7 a11 = o7.a(f8Var2, i7Var, jVar);
                    if (a11 != null) {
                        Set set = (Set) map.get(str);
                        if (set != null) {
                            set.add(a11);
                        } else {
                            HashSet hashSet = new HashSet();
                            hashSet.add(a11);
                            map.put(str, hashSet);
                        }
                    }
                } else {
                    jVar.I();
                    if (com.applovin.impl.sdk.n.a()) {
                        com.applovin.impl.sdk.n I = jVar.I();
                        I.b("VastUtils", "Could not find event for tracking node = " + f8Var2);
                    }
                }
            }
        }
    }

    public static void a(List list, Set set, i7 i7Var, com.applovin.impl.sdk.j jVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("VastUtils", "Unable to render trackers; null nodes provided");
            }
        } else if (set == null) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().b("VastUtils", "Unable to render trackers; null trackers provided");
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                o7 a10 = o7.a((f8) it.next(), i7Var, jVar);
                if (a10 != null) {
                    set.add(a10);
                }
            }
        }
    }

    public static boolean a(f8 f8Var) {
        if (f8Var != null) {
            return f8Var.b("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static String a(i7 i7Var) {
        f8 b10;
        if (i7Var != null) {
            List a10 = i7Var.a();
            int size = i7Var.a().size();
            if (size <= 0 || (b10 = ((f8) a10.get(size - 1)).b("VASTAdTagURI")) == null) {
                return null;
            }
            return b10.d();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static String a(f8 f8Var, String str, String str2) {
        f8 c10 = f8Var.c(str);
        if (c10 != null) {
            String d10 = c10.d();
            if (StringUtils.isValidString(d10)) {
                return d10;
            }
        }
        return str2;
    }

    private static Set a(i7 i7Var, com.applovin.impl.sdk.j jVar) {
        List a10;
        if (i7Var == null) {
            return null;
        }
        List<f8> a11 = i7Var.a();
        HashSet hashSet = new HashSet(a11.size());
        for (f8 f8Var : a11) {
            f8 b10 = f8Var.b("Wrapper");
            if (b10 == null) {
                b10 = f8Var.b("InLine");
            }
            if (b10 != null) {
                a10 = b10.a("Error");
            } else {
                a10 = f8Var.a("Error");
            }
            hashSet = a(hashSet, a10, i7Var, jVar);
        }
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            com.applovin.impl.sdk.n I = jVar.I();
            I.a("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    private static HashSet a(HashSet hashSet, List list, i7 i7Var, com.applovin.impl.sdk.j jVar) {
        if (list == null) {
            return hashSet;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o7 a10 = o7.a((f8) it.next(), i7Var, jVar);
            if (a10 != null) {
                hashSet.add(a10);
            }
        }
        return hashSet;
    }
}
