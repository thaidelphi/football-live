package com.appnext.core.b;

import android.content.Context;
import android.text.TextUtils;
import com.appnext.core.p;
import com.appnext.core.q;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {
    private static a em;
    private String el;

    private a(final Context context) {
        p.ac().a(new Runnable() { // from class: com.appnext.core.b.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a aVar = a.this;
                    q.ad();
                    aVar.el = q.j(context);
                } catch (Throwable th) {
                    com.appnext.base.a.a("Language$Language", th);
                }
            }
        });
    }

    public static synchronized a q(Context context) {
        a aVar;
        synchronized (a.class) {
            if (em == null) {
                em = new a(context.getApplicationContext());
            }
            aVar = em;
        }
        return aVar;
    }

    public final String a(String str, String str2, String str3) {
        if (str == null || str.equals("")) {
            str = Locale.getDefault().getLanguage().toUpperCase();
        }
        try {
            try {
                return a(this.el, str, str2, str3);
            } catch (Throwable unused) {
                return a("{\"EN\":{\"settings\":{\"active\":true,\"len\":12,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"Install\",\"Download\":\"Download\",\"Shop\":\"Shop\",\"Sign up\":\"Sign up\",\"Watch\":\"Watch\",\"Join\":\"Join\",\"Start\":\"Start\",\"Subscribe\":\"Subscribe\",\"Add\":\"Add\",\"Search\":\"Search\",\"Share\":\"Share\",\"Get\":\"Get\",\"Book\":\"Book\",\"Play\":\"Play\"},\"existing\":{\"Install\":\"Install\",\"Use\":\"Use\",\"Play\":\"Play\",\"Reserve\":\"Reserve\",\"Buy\":\"Buy\",\"View\":\"View\",\"Log in\":\"Log in\",\"Listen\":\"Listen\",\"Read\":\"Read\",\"Watch\":\"Watch\",\"See more\":\"See more\",\"Find\":\"Find\",\"Book\":\"Book\",\"Chat\":\"Chat\",\"Park\":\"Park\",\"Open\":\"Open\",\"Exercise\":\"Exercise\",\"Optimize\":\"Optimize\"}},\"KO\":{\"settings\":{\"active\":true,\"len\":10,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"설치\",\"Download\":\"다운로드\",\"Shop\":\"가게에서 물건을 사다\",\"Sign up\":\"회원가입\",\"Watch\":\"보다\",\"Join\":\"입회하다\",\"Start\":\"시작\",\"Subscribe\":\"구독\",\"Add\":\"추가\",\"Search\":\"검색\",\"Share\":\"공유\",\"Get\":\"얻다\",\"Book\":\"예약\",\"Play\":\"재생\"},\"existing\":{\"Install\":\"설치\",\"Use\":\"설치\",\"Play\":\"재생\",\"Reserve\":\"예약하기\",\"Buy\":\"구매하기\",\"View\":\"바라보다\",\"Log in\":\"로그인\",\"Listen\":\"듣기\",\"Read\":\"읽기\",\"Watch\":\"보기\",\"See more\":\"더 보기\",\"Find\":\"찾기\",\"Book\":\"예약\",\"Chat\":\"채팅\",\"Park\":\"읽기\",\"Open\":\"개장\",\"Exercise\":\"연습하다\",\"Optimize\":\"최적화하기\"}}}", str, str2, str3);
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("Translate$translate", th);
            try {
                return a(this.el, "EN", str2, str3);
            } catch (Throwable unused2) {
                com.appnext.base.a.a("Translate$translate", th);
                try {
                    return a("{\"EN\":{\"settings\":{\"active\":true,\"len\":12,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"Install\",\"Download\":\"Download\",\"Shop\":\"Shop\",\"Sign up\":\"Sign up\",\"Watch\":\"Watch\",\"Join\":\"Join\",\"Start\":\"Start\",\"Subscribe\":\"Subscribe\",\"Add\":\"Add\",\"Search\":\"Search\",\"Share\":\"Share\",\"Get\":\"Get\",\"Book\":\"Book\",\"Play\":\"Play\"},\"existing\":{\"Install\":\"Install\",\"Use\":\"Use\",\"Play\":\"Play\",\"Reserve\":\"Reserve\",\"Buy\":\"Buy\",\"View\":\"View\",\"Log in\":\"Log in\",\"Listen\":\"Listen\",\"Read\":\"Read\",\"Watch\":\"Watch\",\"See more\":\"See more\",\"Find\":\"Find\",\"Book\":\"Book\",\"Chat\":\"Chat\",\"Park\":\"Park\",\"Open\":\"Open\",\"Exercise\":\"Exercise\",\"Optimize\":\"Optimize\"}},\"KO\":{\"settings\":{\"active\":true,\"len\":10,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"설치\",\"Download\":\"다운로드\",\"Shop\":\"가게에서 물건을 사다\",\"Sign up\":\"회원가입\",\"Watch\":\"보다\",\"Join\":\"입회하다\",\"Start\":\"시작\",\"Subscribe\":\"구독\",\"Add\":\"추가\",\"Search\":\"검색\",\"Share\":\"공유\",\"Get\":\"얻다\",\"Book\":\"예약\",\"Play\":\"재생\"},\"existing\":{\"Install\":\"설치\",\"Use\":\"설치\",\"Play\":\"재생\",\"Reserve\":\"예약하기\",\"Buy\":\"구매하기\",\"View\":\"바라보다\",\"Log in\":\"로그인\",\"Listen\":\"듣기\",\"Read\":\"읽기\",\"Watch\":\"보기\",\"See more\":\"더 보기\",\"Find\":\"찾기\",\"Book\":\"예약\",\"Chat\":\"채팅\",\"Park\":\"읽기\",\"Open\":\"개장\",\"Exercise\":\"연습하다\",\"Optimize\":\"최적화하기\"}}}", "EN", str2, str3);
                } catch (Throwable unused3) {
                    com.appnext.base.a.a("Translate$translate", th);
                    return str3;
                }
            }
        }
    }

    public final String ak() {
        String str = this.el;
        return str != null ? str : "{\"EN\":{\"settings\":{\"active\":true,\"len\":12,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"Install\",\"Download\":\"Download\",\"Shop\":\"Shop\",\"Sign up\":\"Sign up\",\"Watch\":\"Watch\",\"Join\":\"Join\",\"Start\":\"Start\",\"Subscribe\":\"Subscribe\",\"Add\":\"Add\",\"Search\":\"Search\",\"Share\":\"Share\",\"Get\":\"Get\",\"Book\":\"Book\",\"Play\":\"Play\"},\"existing\":{\"Install\":\"Install\",\"Use\":\"Use\",\"Play\":\"Play\",\"Reserve\":\"Reserve\",\"Buy\":\"Buy\",\"View\":\"View\",\"Log in\":\"Log in\",\"Listen\":\"Listen\",\"Read\":\"Read\",\"Watch\":\"Watch\",\"See more\":\"See more\",\"Find\":\"Find\",\"Book\":\"Book\",\"Chat\":\"Chat\",\"Park\":\"Park\",\"Open\":\"Open\",\"Exercise\":\"Exercise\",\"Optimize\":\"Optimize\"}},\"KO\":{\"settings\":{\"active\":true,\"len\":10,\"font_size_px\":12,\"font_size_sp\":10},\"new\":{\"Install\":\"설치\",\"Download\":\"다운로드\",\"Shop\":\"가게에서 물건을 사다\",\"Sign up\":\"회원가입\",\"Watch\":\"보다\",\"Join\":\"입회하다\",\"Start\":\"시작\",\"Subscribe\":\"구독\",\"Add\":\"추가\",\"Search\":\"검색\",\"Share\":\"공유\",\"Get\":\"얻다\",\"Book\":\"예약\",\"Play\":\"재생\"},\"existing\":{\"Install\":\"설치\",\"Use\":\"설치\",\"Play\":\"재생\",\"Reserve\":\"예약하기\",\"Buy\":\"구매하기\",\"View\":\"바라보다\",\"Log in\":\"로그인\",\"Listen\":\"듣기\",\"Read\":\"읽기\",\"Watch\":\"보기\",\"See more\":\"더 보기\",\"Find\":\"찾기\",\"Book\":\"예약\",\"Chat\":\"채팅\",\"Park\":\"읽기\",\"Open\":\"개장\",\"Exercise\":\"연습하다\",\"Optimize\":\"최적화하기\"}}}";
    }

    private static String a(String str, String str2, String str3, String str4) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.has(str2)) {
            str2 = jSONObject.has("EN") ? "EN" : null;
        }
        return (TextUtils.isEmpty(str2) || !jSONObject.getJSONObject(str2).getJSONObject("settings").getBoolean("active")) ? str4 : jSONObject.getJSONObject(str2).getJSONObject(str3).getString(str4);
    }
}
