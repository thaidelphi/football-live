package com.startapp;

import android.text.TextUtils;
import com.ironsource.cc;
import com.startapp.sdk.common.SDKException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class z5 extends w6 {

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f23670b;

    public z5(Set<String> set) {
        super(set);
        this.f23670b = new HashSet();
    }

    @Override // com.startapp.w6
    public final void a(String str, Object obj, boolean z10, boolean z11) throws SDKException {
        if (this.f23509a.contains(str)) {
            return;
        }
        if (z10 && obj == null) {
            throw new SDKException(str, null);
        }
        if (obj == null || TextUtils.isEmpty(obj.toString())) {
            return;
        }
        try {
            a6 a6Var = new a6();
            a6Var.f21760a = str;
            String obj2 = obj.toString();
            if (z11) {
                obj2 = URLEncoder.encode(obj2, "UTF-8");
            }
            a6Var.f21761b = obj2;
            if (this.f23670b.add(a6Var)) {
                return;
            }
            this.f23670b.remove(a6Var);
            this.f23670b.add(a6Var);
        } catch (UnsupportedEncodingException e8) {
            if (z10) {
                throw new SDKException(str, e8);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('?');
        Iterator it = this.f23670b.iterator();
        while (it.hasNext()) {
            a6 a6Var = (a6) it.next();
            if (a6Var.f21761b != null) {
                sb.append(a6Var.f21760a);
                sb.append(cc.T);
                sb.append(a6Var.f21761b);
                sb.append('&');
            } else {
                Set<String> set = a6Var.f21762c;
                if (set != null) {
                    for (String str : set) {
                        sb.append(a6Var.f21760a);
                        sb.append(cc.T);
                        sb.append(str);
                        sb.append('&');
                    }
                }
            }
        }
        if (sb.length() != 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString().replace("+", "%20");
    }

    @Override // com.startapp.w6
    public final void a(String str, Set set) throws SDKException {
        if (this.f23509a.contains(str) || set == null) {
            return;
        }
        a6 a6Var = new a6();
        a6Var.f21760a = str;
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add(URLEncoder.encode((String) it.next(), "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        a6Var.f21762c = hashSet;
        if (this.f23670b.add(a6Var)) {
            return;
        }
        this.f23670b.remove(a6Var);
        this.f23670b.add(a6Var);
    }
}
