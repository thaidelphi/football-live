package com.startapp;

import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.sdk.controller.f;
import com.ironsource.xn;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final j2<AnalyticsConfig> f22269a;

    public m(com.startapp.sdk.components.z zVar) {
        this.f22269a = zVar;
    }

    public final void a(n nVar) {
        long j10;
        long j11;
        List<String> list;
        String group;
        AnalyticsConfig call = this.f22269a.call();
        if (call != null && Math.random() < call.c()) {
            StringBuilder sb = new StringBuilder();
            boolean z10 = nVar.f22300c;
            sb.append("preLoading=");
            sb.append(z10 ? 1 : 0);
            sb.append(", ");
            if (nVar.f22301d) {
                boolean z11 = nVar.f22303f;
                sb.append("appPresent=");
                sb.append(z11 ? 1 : 0);
                sb.append(", ");
            }
            n.a(sb);
            String sb2 = sb.toString();
            sb.delete(0, sb.length());
            List<String> b10 = call.b();
            n.a(sb, f.b.f20339c, nVar.f22298a, true);
            long j12 = nVar.f22299b.f21906e;
            sb.append("start");
            sb.append(cc.T);
            sb.append(j12);
            sb.append(", ");
            Map<String, List<String>> map = nVar.f22299b.f21905d;
            if (map != null && (list = map.get("Server-Timing")) != null) {
                Pattern pattern = n.f22297m;
                if (pattern == null) {
                    pattern = Pattern.compile("^total;dur=(\\d+(\\.\\d*)?)$");
                    n.f22297m = pattern;
                }
                for (String str : list) {
                    Matcher matcher = pattern.matcher(str);
                    if (matcher.matches() && (group = matcher.group(1)) != null) {
                        j10 = (long) (Double.parseDouble(group) * 1000000.0d);
                        break;
                    }
                }
            }
            j10 = 0;
            if (j10 > 0) {
                n.a(sb, "serverTotal", n.a(j10), false);
            }
            e3 e3Var = nVar.f22299b;
            n.a(sb, "network", n.a((e3Var.f21908g - e3Var.f21907f) - j10), false);
            long j13 = nVar.f22304g;
            if (j13 > 0) {
                n.a(sb, "parsing", n.a(j13 - nVar.f22299b.f21908g), false);
                if (nVar.f22300c) {
                    long j14 = nVar.f22305h;
                    if (j14 > 0) {
                        n.a(sb, "beforeLoad", n.a(j14 - nVar.f22304g), false);
                        if (nVar.f22302e) {
                            sb.append("preLoadingSkipped");
                            sb.append(cc.T);
                            sb.append(1);
                            sb.append(", ");
                            j11 = nVar.f22305h;
                        } else {
                            long j15 = nVar.f22306i;
                            if (j15 > 0) {
                                n.a(sb, b9.a.f16535f, n.a(j15 - nVar.f22305h), false);
                                n.a(sb, "loading", n.a(nVar.f22307j - nVar.f22306i), false);
                                boolean z12 = nVar.f22309l;
                                sb.append(b9.g.A);
                                sb.append(cc.T);
                                sb.append(z12 ? 1 : 0);
                                sb.append(", ");
                                j11 = nVar.f22307j;
                            } else {
                                sb.append(xn.a.f21422g);
                                sb.append(cc.T);
                                sb.append(nVar.f22308k);
                                sb.append(", ");
                                j11 = nVar.f22305h;
                            }
                        }
                    }
                }
                j11 = nVar.f22304g;
            } else {
                j11 = nVar.f22299b.f21908g;
            }
            n.a(sb, b9.h.f16660l, n.a(j11 - nVar.f22299b.f21907f), false);
            Map<String, List<String>> map2 = nVar.f22299b.f21905d;
            if (map2 != null && b10 != null) {
                sb.append("headers");
                sb.append("={");
                for (Map.Entry<String, List<String>> entry : map2.entrySet()) {
                    if (b10.contains(entry.getKey()) && entry.getValue() != null) {
                        sb.append(entry.getKey());
                        sb.append("=[");
                        for (String str2 : entry.getValue()) {
                            n.a(sb, null, str2, true);
                        }
                        n.a(sb);
                        sb.append(']');
                        sb.append(", ");
                    }
                }
                n.a(sb);
                sb.append("}");
                sb.append(", ");
            }
            n.a(sb);
            String sb3 = sb.toString();
            l3 l3Var = new l3(m3.f22274d);
            l3Var.f22228d = "ADM";
            l3Var.f22233i = sb2;
            l3Var.f22229e = sb3;
            l3Var.a();
        }
    }
}
