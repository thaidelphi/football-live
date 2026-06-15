package com.appnext.actionssdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.appnext.core.Ad;
import com.appnext.core.AppnextError;
import com.appnext.core.callbacks.OnECPMLoaded;
import com.ironsource.fe;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ActionAd extends Ad {
    private String G;
    private String H;
    String I;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appnext.actionssdk.ActionAd$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public final class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!com.appnext.core.f.z(((Ad) ActionAd.this).context)) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.actionssdk.ActionAd.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ActionAd.this.getOnAdErrorCallback() != null) {
                            ActionAd.this.getOnAdErrorCallback().adError(AppnextError.CONNECTION_ERROR);
                        }
                    }
                });
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.actionssdk.ActionAd.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        Intent intent = new Intent(((Ad) ActionAd.this).context, ActionsServiceActivity.class);
                        Bundle bundle = new Bundle();
                        String str = f.y().get("pair_" + ActionAd.this.getCategories());
                        StringBuilder sb = new StringBuilder();
                        sb.append(ActionAd.this.getCategories());
                        String str2 = "";
                        if (str != null && !str.equals("")) {
                            str2 = "," + str;
                        }
                        sb.append(str2);
                        bundle.putString("actions", sb.toString());
                        bundle.putString("selected", ActionAd.this.getCategories());
                        bundle.putString("placement", ActionAd.this.getPlacementID());
                        ActionData F = g.F(ActionAd.this.getCategories());
                        if (F != null) {
                            bundle.putBoolean("isExpired", F.getExpireMillis() < System.currentTimeMillis());
                        }
                        bundle.putString("size", ServiceProvider.NAMED_SDK);
                        bundle.putString("jsURL", ActionAd.this.I);
                        bundle.putString(fe.f17443q, ActionAd.this.H);
                        intent.putExtras(bundle);
                        try {
                            ((Ad) ActionAd.this).context.startActivity(intent);
                        } catch (Throwable unused) {
                            intent.setFlags(268435456);
                            intent.addFlags(67108864);
                            ((Ad) ActionAd.this).context.startActivity(intent);
                        }
                    }
                });
            }
        }
    }

    public ActionAd(Context context, String str) {
        super(context, str);
        this.G = "white";
        this.H = "";
        this.I = "https://cdn.appnext.com/tools/sdk/actions_webview/result_page/2.4.3/result.min.js";
        setCount(2);
    }

    protected static String h() {
        return "";
    }

    @Override // com.appnext.core.Ad
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            ActionAd actionAd = (ActionAd) obj;
            return (getLang().equals("") ? com.appnext.base.b.f.cg() : getLang()).equals(actionAd.getLang().equals("") ? com.appnext.base.b.f.cg() : actionAd.getLang());
        }
        return false;
    }

    @Override // com.appnext.core.Ad
    public String getAUID() {
        return "";
    }

    public String getActionColor() {
        return this.G;
    }

    public ArrayList<AdData> getAdsData() {
        return a.j().f(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.Ad
    public Context getContext() {
        return this.context;
    }

    @Override // com.appnext.core.Ad
    public void getECPM(OnECPMLoaded onECPMLoaded) {
    }

    public String getLang() {
        return this.H;
    }

    public ArrayList<AdData> getSortedAds() {
        ArrayList<AdData> arrayList;
        try {
            arrayList = getAdsData();
        } catch (Throwable unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        ActionData F = g.F(getCategories());
        if (F != null) {
            ArrayList<AdData> a10 = a(this.context, arrayList, getCategories(), F.getExpireMillis() < System.currentTimeMillis());
            Iterator<AdData> it = a10.iterator();
            while (it.hasNext()) {
                AdData next = it.next();
                if (next.I() == null) {
                    next.x(F.o());
                }
            }
            return a10;
        }
        return a(this.context, arrayList, getCategories(), false);
    }

    @Override // com.appnext.core.Ad
    public String getTID() {
        return "AASDK";
    }

    @Override // com.appnext.core.Ad
    public String getVID() {
        return Action.VID;
    }

    @Override // com.appnext.core.Ad
    public int hashCode() {
        return (super.hashCode() * 31) + (getLang().equals("") ? com.appnext.base.b.f.cg() : getLang()).hashCode();
    }

    @Override // com.appnext.core.Ad
    public boolean isAdLoaded() {
        return false;
    }

    @Override // com.appnext.core.Ad
    public void loadAd() {
    }

    public void setActionColor(String str) {
        try {
            this.G = URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            this.G = "white";
        }
    }

    public void setLang(String str) {
        this.H = str;
    }

    @Override // com.appnext.core.Ad
    public void showAd() {
        showAd(ActionSDK.ACTION_DIALOG);
    }

    private void a(ArrayList<AdData> arrayList, int i10) {
        if (this.context == null) {
            if (getOnAdErrorCallback() != null) {
                getOnAdErrorCallback().adError(AppnextError.NULL_CONTEXT);
                return;
            }
            return;
        }
        new Thread(new AnonymousClass1()).start();
    }

    private static ArrayList<AdData> c(ArrayList<AdData> arrayList) {
        ArrayList<AdData> arrayList2 = new ArrayList<>();
        Iterator<AdData> it = arrayList.iterator();
        while (it.hasNext()) {
            AdData next = it.next();
            if (!next.getType().equals(AdData.SPONSORED)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public void showAd(int i10) {
        ArrayList<AdData> sortedAds = getSortedAds();
        if (sortedAds != null && sortedAds.size() != 0) {
            if (this.context == null) {
                if (getOnAdErrorCallback() != null) {
                    getOnAdErrorCallback().adError(AppnextError.NULL_CONTEXT);
                    return;
                }
                return;
            }
            new Thread(new AnonymousClass1()).start();
        } else if (getOnAdErrorCallback() != null) {
            getOnAdErrorCallback().adError(AppnextError.NO_ADS);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ActionAd(Ad ad) {
        super(ad);
        this.G = "white";
        this.H = "";
        this.I = "https://cdn.appnext.com/tools/sdk/actions_webview/result_page/2.4.3/result.min.js";
        ActionAd actionAd = (ActionAd) ad;
        this.G = actionAd.G;
        this.H = actionAd.getLang();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayList<AdData> a(Context context, ArrayList<AdData> arrayList, String str, boolean z10) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        a j10 = a.j();
        Iterator<AdData> it = arrayList.iterator();
        while (it.hasNext()) {
            AdData next = it.next();
            if (j10.a(context, (com.appnext.core.g) next) == 0) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            AdData adData = (AdData) it2.next();
            if (adData.getType().equals(AdData.SPONSORED)) {
                arrayList3.add(adData);
            } else if (com.appnext.core.f.i(context, adData.C())) {
                arrayList4.add(adData);
            } else {
                arrayList6.add(adData);
            }
        }
        ArrayList<AdData> arrayList7 = new ArrayList<>(arrayList3);
        if (z10) {
            arrayList7.clear();
            arrayList3.clear();
        }
        if (!f.y().get(AdData.SPONSORED).equals("1") && arrayList7.size() != 5) {
            if (arrayList7.size() != 3) {
                arrayList5.addAll(g.a(context, str, -1));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    if (a(((AdData) it3.next()).C(), arrayList2)) {
                        it3.remove();
                    }
                }
                arrayList4.addAll(arrayList5);
                if (arrayList4.size() > 0) {
                    if (arrayList4.size() == 1) {
                        arrayList7.add(arrayList4.get(0));
                    } else {
                        int i10 = arrayList3.size() <= 0 ? 2 : 1;
                        for (int i11 = 0; i11 < i10; i11++) {
                            arrayList7.add(arrayList4.get(i11));
                        }
                    }
                }
                int size = (arrayList3.size() >= 4 ? 5 : 3) - arrayList7.size();
                if (arrayList3.size() == 0) {
                    size = 5 - arrayList7.size();
                }
                for (int i12 = 0; i12 < Math.min(size, arrayList6.size()); i12++) {
                    arrayList7.add(arrayList6.get(i12));
                }
            }
        }
        return arrayList7;
    }

    private static boolean a(String str, ArrayList<AdData> arrayList) {
        Iterator<AdData> it = arrayList.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().C())) {
                return true;
            }
        }
        return false;
    }
}
