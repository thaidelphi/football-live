package com.appnext.actionssdk;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import com.appnext.actionssdk.g;
import com.appnext.banners.BannerAdRequest;
import com.appnext.core.Ad;
import com.appnext.core.d;
import com.appnext.core.p;
import com.ironsource.b9;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.xn;
import com.ironsource.yk;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends com.appnext.core.d {
    private static a L = null;
    private static long M = 604800000;
    private static long N = 1209600000;
    private static int O = 4000;
    private ArrayList<ActionData> P = new ArrayList<>();
    private boolean Q = true;

    /* renamed from: com.appnext.actionssdk.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class RunnableC0148a implements Runnable {
        String V;
        String W;
        String X;

        RunnableC0148a(String str, String str2, String str3) {
            this.V = str;
            this.W = str2;
            this.X = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a.a(a.this, this.V, this.W, this.X);
            } catch (Throwable unused) {
            }
        }
    }

    protected a() {
    }

    private String d(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<String> it = e(str).iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    Object newInstance = Class.forName("com.appnext.base.operations.imp." + next).getConstructor(com.appnext.base.a.b.c.class, Bundle.class, Object.class).newInstance(null, null, null);
                    if (newInstance instanceof com.appnext.base.operations.a) {
                        com.appnext.base.operations.a aVar = (com.appnext.base.operations.a) newInstance;
                        Method declaredMethod = aVar.getClass().getDeclaredMethod("getData", new Class[0]);
                        if (!declaredMethod.isAccessible()) {
                            declaredMethod.setAccessible(true);
                        }
                        List<com.appnext.base.a.b.b> list = (List) declaredMethod.invoke(aVar, new Object[0]);
                        if (list != null) {
                            for (com.appnext.base.a.b.b bVar : list) {
                                jSONArray.put(new JSONObject().put(next, bVar.aZ()));
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
        return jSONArray.toString();
    }

    private static ArrayList<String> e(String str) {
        String[] split;
        if (str.equals("")) {
            split = Action.completeActionList;
        } else {
            split = str.split("%2C");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : split) {
            if (f.y().get(str2) != null) {
                try {
                    JSONArray jSONArray = new JSONArray(f.y().get(str2));
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        arrayList.add(jSONArray.getString(i10));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public static synchronized a j() {
        a aVar;
        synchronized (a.class) {
            if (L == null) {
                L = new a();
            }
            aVar = L;
        }
        return aVar;
    }

    @Override // com.appnext.core.d
    protected final void a(Ad ad, String str, String str2) {
    }

    protected final boolean a(Context context, Ad ad, ArrayList<?> arrayList) {
        return true;
    }

    protected final boolean c(Ad ad) {
        if (k(ad) != null) {
            boolean equals = ad.getCategories().equals("");
            String str = BannerAdRequest.TYPE_ALL;
            if (g.F(equals ? BannerAdRequest.TYPE_ALL : ad.getCategories()) != null) {
                if (!ad.getCategories().equals("")) {
                    str = ad.getCategories();
                }
                return g.F(str).getExpireMillis() > System.currentTimeMillis();
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ArrayList<?> f(Ad ad) {
        if (k(ad) != null) {
            return k(ad).getAds();
        }
        return null;
    }

    protected final int k() {
        return 60000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ArrayList<ActionData> l() {
        Iterator<ActionData> it = this.P.iterator();
        while (it.hasNext()) {
            if (it.next().getExpireMillis() < System.currentTimeMillis()) {
                it.remove();
            }
        }
        ArrayList<ActionData> arrayList = new ArrayList<>();
        Iterator<ActionData> it2 = this.P.iterator();
        while (it2.hasNext()) {
            arrayList.add(new ActionData(it2.next()));
        }
        return arrayList;
    }

    public final com.appnext.core.g parseAd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            AdData adData = (AdData) com.appnext.core.l.a(AdData.class, jSONObject);
            if (adData != null) {
                adData.setAdJSON(jSONObject.toString());
            }
            return adData;
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void b(String str, ArrayList<Pair<String, String>> arrayList) {
        if (str.equals("")) {
            return;
        }
        for (String str2 : str.split("%2C")) {
            try {
                arrayList.add(new Pair<>("action", str2));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.appnext.core.d
    protected final String a(Context context, Ad ad, String str, ArrayList<Pair<String, String>> arrayList) {
        String cg;
        StringBuilder sb = new StringBuilder("http://global.appnext.com/offerWallApi.aspx?ext=t&pimp=1&igroup=sdk&m=1&osid=100&auid=");
        sb.append(ad != null ? ad.getAUID() : "");
        sb.append("&type=json&id=");
        sb.append(str);
        sb.append("&cnt=200&tid=301&vid=");
        sb.append(Action.VID);
        sb.append("&did=");
        sb.append(com.appnext.core.f.b(context, false));
        sb.append("&vidmin=");
        sb.append(ad == null ? "" : Integer.valueOf(ad.getMinVideoLength()));
        sb.append("&vidmax=");
        sb.append(ad == null ? "" : Integer.valueOf(ad.getMaxVideoLength()));
        sb.append("&devn=");
        sb.append(com.appnext.core.f.cE());
        sb.append("&pbk=");
        sb.append(f.y().get("q") != null ? f.y().get("q") : "");
        sb.append("&dosv=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("&dct=");
        sb.append(com.appnext.core.f.aM(com.appnext.core.f.v(context)));
        sb.append("&lang=");
        if (ad != null) {
            ActionAd actionAd = (ActionAd) ad;
            if (!actionAd.getLang().equals("")) {
                cg = actionAd.getLang();
                sb.append(cg);
                sb.append("&dcc=");
                sb.append(com.appnext.core.f.w(context));
                sb.append("&dds=0");
                sb.append("&packageId=");
                sb.append(context.getPackageName());
                sb.append("&rnd=");
                sb.append(new Random().nextInt());
                return sb.toString();
            }
        }
        cg = com.appnext.base.b.f.cg();
        sb.append(cg);
        sb.append("&dcc=");
        sb.append(com.appnext.core.f.w(context));
        sb.append("&dds=0");
        sb.append("&packageId=");
        sb.append(context.getPackageName());
        sb.append("&rnd=");
        sb.append(new Random().nextInt());
        return sb.toString();
    }

    protected final boolean f(String str) {
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("actions");
            if (jSONArray.length() != 0) {
                return jSONArray.getJSONObject(0).has(xn.a.f21422g);
            }
            return true;
        } catch (Throwable unused) {
            return super.f(str);
        }
    }

    protected final boolean b(Ad ad) {
        return !(ad instanceof Moment) && super.b(ad);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean e(Ad ad) {
        return a(ad) && k(ad).getAds() != null && k(ad).getAds().size() > 0;
    }

    protected final p d(Ad ad) {
        return f.y();
    }

    @Override // com.appnext.core.d
    public final void a(final Context context, final Ad ad, final String str, final d.a aVar) {
        if (g.isLoaded()) {
            super.a(context, ad, str, aVar);
        } else {
            g.a(context, new g.a() { // from class: com.appnext.actionssdk.a.1
                @Override // com.appnext.actionssdk.g.a
                public final void error() {
                    a.super.a(context, ad, str, aVar);
                }

                @Override // com.appnext.actionssdk.g.a
                public final void m() {
                    a.super.a(context, ad, str, aVar);
                }
            });
        }
    }

    @Override // com.appnext.core.d
    protected final void a(Context context, Ad ad, com.appnext.core.a aVar) throws Exception {
        ArrayList arrayList = new ArrayList();
        ArrayList<?> ads = aVar.getAds();
        Iterator<?> it = ads.iterator();
        while (it.hasNext()) {
            AdData adData = (AdData) it.next();
            if (!arrayList.contains(adData.getAction())) {
                arrayList.add(adData.getAction());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            ActionAd actionAd = new ActionAd(((ActionAd) ad).getContext(), ad.getPlacementID());
            actionAd.setCategories(str);
            actionAd.setPostback(ad.getPostback());
            actionAd.setLang(((ActionAd) ad).getLang());
            com.appnext.core.a aVar2 = new com.appnext.core.a();
            aVar2.setPlacementID(ad.getPlacementID());
            aVar2.setState(2);
            ArrayList unused = aVar2.bX;
            ArrayList<AdData> a10 = a(context, ads, str);
            ArrayList arrayList2 = new ArrayList();
            Iterator<AdData> it3 = a10.iterator();
            while (it3.hasNext()) {
                AdData next = it3.next();
                AdData a11 = a(arrayList2, next);
                if (a11 != null) {
                    arrayList2.remove(a11);
                    if (a11.getRevenueType().equals(next.getRevenueType())) {
                        if (Float.parseFloat(a11.getRevenueRate()) < Float.parseFloat(next.getRevenueRate())) {
                        }
                        next = a11;
                    } else {
                        if (!a11.getRevenueType().equals("cpc")) {
                        }
                        next = a11;
                    }
                }
                arrayList2.add(next);
            }
            aVar2.g(arrayList2);
            a(actionAd, aVar2);
        }
        String str2 = context.getFilesDir().getAbsolutePath() + "/data/appnext/images/";
        a(new File(str2 + "apps/"), N);
        a(new File(str2 + "actions/"), M);
        a(new File(str2 + "apps/"));
    }

    private static ArrayList<AdData> a(Context context, ArrayList<?> arrayList, String str) {
        ArrayList<AdData> arrayList2 = new ArrayList<>();
        Iterator<?> it = arrayList.iterator();
        while (it.hasNext()) {
            AdData adData = (AdData) it.next();
            if (adData.getAction().equals(str)) {
                arrayList2.add(adData);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            if (com.appnext.core.f.i(context, arrayList2.get(i10).C())) {
                if (arrayList2.get(i10).getType().equals(AdData.SPONSORED)) {
                    arrayList5.add(arrayList2.get(i10));
                } else {
                    arrayList4.add(arrayList2.get(i10));
                }
            } else if (arrayList2.get(i10).getType().equals(AdData.SPONSORED)) {
                arrayList6.add(arrayList2.get(i10));
            } else {
                arrayList3.add(arrayList2.get(i10));
            }
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList5);
        arrayList2.addAll(arrayList6);
        arrayList2.addAll(arrayList4);
        arrayList2.addAll(arrayList3);
        return arrayList2;
    }

    private void a(Context context, ExecutorService executorService, ArrayList<AdData> arrayList) throws IOException {
        AdData next;
        if (this.Q) {
            Iterator<AdData> it = arrayList.iterator();
            while (it.hasNext()) {
                if (!com.appnext.core.f.i(context, it.next().C())) {
                    String str = context.getFilesDir().getAbsolutePath() + "/data/appnext/images/apps/";
                    String str2 = next.C() + ".png";
                    File file = new File(str + str2);
                    if (file.exists() && file.lastModified() >= System.currentTimeMillis() - N) {
                        file.setLastModified(System.currentTimeMillis());
                    } else {
                        try {
                            executorService.execute(new RunnableC0148a("https://cdn.appnext.com/tools/sdk/actions/assets/apps/" + str2, str, str2));
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    private void a(Context context, ExecutorService executorService) throws IOException {
        String str = context.getFilesDir().getAbsolutePath() + "/data/appnext/images/icons/";
        File file = new File(str + "ad.png");
        if (file.exists() && file.lastModified() >= System.currentTimeMillis() - 3600000) {
            file.setLastModified(System.currentTimeMillis());
            return;
        }
        try {
            executorService.execute(new RunnableC0148a("https://cdn.appnext.com/tools/sdk/actions/assets/icons/ad.png", str, "ad.png"));
        } catch (Throwable unused) {
        }
    }

    private static void a(String str, String str2, String str3) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url;
        try {
            new File(str2).mkdirs();
            url = new URL(str);
            httpURLConnection = (HttpURLConnection) url.openConnection();
        } catch (Throwable unused) {
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setConnectTimeout(5000);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream(), 1024);
                FileOutputStream fileOutputStream = new FileOutputStream(str2 + str3);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        bufferedInputStream.close();
                        httpURLConnection.disconnect();
                        return;
                    }
                }
            } else {
                throw new HttpRetryException("download error", responseCode, str);
            }
        } catch (Throwable unused2) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    private static void a(File file, long j10) {
        File[] listFiles;
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    a(file2, j10);
                } else if (file2.lastModified() < System.currentTimeMillis() - j10) {
                    file2.delete();
                }
            }
        }
    }

    private void a(File file) {
        File[] listFiles;
        if (!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length <= O) {
            return;
        }
        Arrays.sort(listFiles, new Comparator<File>() { // from class: com.appnext.actionssdk.a.2
            public static int a(File file2, File file3) {
                return -Long.valueOf(file2.lastModified()).compareTo(Long.valueOf(file3.lastModified()));
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(File file2, File file3) {
                return -Long.valueOf(file2.lastModified()).compareTo(Long.valueOf(file3.lastModified()));
            }
        });
        ArrayList arrayList = new ArrayList(Arrays.asList(listFiles));
        while (true) {
            int size = arrayList.size();
            int i10 = O;
            if (size <= i10) {
                return;
            }
            ((File) arrayList.get(i10)).delete();
            arrayList.remove(O);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int a(Context context, com.appnext.core.g gVar) {
        AdData adData = (AdData) gVar;
        if (adData.getType().equals(AdData.SPONSORED)) {
            int a10 = a(context, adData);
            if (a10 != 0) {
                return a10;
            }
            if (adData.M().equals("both")) {
                return ((com.appnext.core.f.i(context, adData.C()) || adData.G().equals("")) && (!com.appnext.core.f.i(context, adData.C()) || adData.H().equals(""))) ? 3 : 0;
            } else if (adData.M().equals("new")) {
                return (com.appnext.core.f.i(context, adData.C()) || adData.G().equals("")) ? 1 : 0;
            } else if (adData.M().equals("existing")) {
                return (!com.appnext.core.f.i(context, adData.C()) || adData.H().equals("")) ? 2 : 0;
            } else {
                return 3;
            }
        }
        return 0;
    }

    @Override // com.appnext.core.d
    protected final <T> void a(String str, Ad ad, T t10) {
        HashMap cw = cw();
        if (ad.getCategories().contains(",")) {
            cw.remove(new com.appnext.core.b(ad));
        }
    }

    private static ActionData a(ArrayList<ActionData> arrayList, String str) {
        Iterator<ActionData> it = arrayList.iterator();
        while (it.hasNext()) {
            ActionData next = it.next();
            if (next.getActionParam().equals(str)) {
                return next;
            }
        }
        return null;
    }

    protected final ArrayList<? extends com.appnext.core.g> a(final Context context, Ad ad, String str, int i10) throws JSONException {
        int i11;
        JSONObject jSONObject;
        AdData adData;
        ArrayList arrayList = new ArrayList();
        final StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArray = new JSONObject(str).getJSONArray("apps");
        int i12 = 0;
        while (i12 < jSONArray.length()) {
            try {
                jSONObject = jSONArray.getJSONObject(i12);
                adData = new AdData();
                adData.x("0");
                adData.p(jSONObject.getString("androidPackage"));
                adData.y(jSONObject.getString("bId"));
                adData.setButtonText(jSONObject.getString("buttonText"));
                adData.setCategories(jSONObject.getString("categories"));
                adData.E(jSONObject.getString(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY));
                adData.setCptList(jSONObject.getString("cpt_list"));
                adData.B(jSONObject.getString("campaignGoal"));
                adData.w(jSONObject.getString("desc"));
                adData.v(jSONObject.getString("desc"));
                adData.setGdpr(jSONObject.getString("gdpr"));
                adData.setWebview(jSONObject.getString(b9.h.K));
                adData.o(jSONObject.getString("urlApp"));
                adData.setStoreRating(jSONObject.getString("storeRating"));
                adData.setStoreDownloads(jSONObject.getString("storeDownloads"));
                adData.A(jSONObject.getString("urlApp") + "&ox=0");
                adData.t(AdData.SPONSORED);
                adData.setRevenueType(jSONObject.getString("revenueType"));
                adData.setRevenueRate(jSONObject.getString("revenueRate"));
                adData.D(jSONObject.getString("urlImgWide"));
                adData.r(jSONObject.getString("urlImg"));
                adData.z(jSONObject.getString("pixelImp"));
                adData.setName(jSONObject.getString(b9.h.D0));
                adData.setPlacementID(ad.getPlacementID());
            } catch (Throwable unused) {
            }
            if (a(context, (com.appnext.core.g) adData) == 0) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("package_action");
                int i13 = 0;
                while (i13 < jSONArray2.length()) {
                    if (a(arrayList, jSONArray2.getString(i13)) == null) {
                        ActionData actionData = new ActionData();
                        actionData.h(jSONArray2.getString(i13));
                        actionData.g(c.m(actionData.getActionParam()));
                        i11 = i12;
                        try {
                            actionData.a(System.currentTimeMillis() + 1800000);
                            actionData.j("0");
                            arrayList.add(actionData);
                            continue;
                        } catch (Throwable unused2) {
                        }
                    } else {
                        i11 = i12;
                        continue;
                    }
                    AdData adData2 = (AdData) parseAd(adData.a(context));
                    adData2.s(jSONArray2.getString(i13));
                    adData2.setAdID(arrayList2.size());
                    arrayList2.add(adData2);
                    i13++;
                    i12 = i11;
                }
                i11 = i12;
            } else {
                i11 = i12;
                sb.append(adData.J());
                sb.append(",");
            }
            i12 = i11 + 1;
        }
        new Thread(new Runnable() { // from class: com.appnext.actionssdk.a.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    String sb2 = sb.toString();
                    if (sb2.length() == 0) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    String b10 = com.appnext.core.f.b(context, true);
                    if (b10.equals("")) {
                        return;
                    }
                    hashMap.put(yk.f21552b, b10);
                    hashMap.put("bids", sb2.substring(0, sb2.length() - 1));
                    com.appnext.core.f.a("https://admin.appnext.com/AdminService.asmx/bns", hashMap);
                } catch (Throwable unused3) {
                }
            }
        }).start();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActionData actionData2 = (ActionData) it.next();
            g.a(actionData2.getActionParam(), actionData2);
        }
        return a(context, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.d
    public final boolean a(Ad ad) {
        return (k(ad) == null || g.F(ad.getCategories()) == null || g.F(ad.getCategories()).getExpireMillis() <= System.currentTimeMillis() || k(ad).getAds() == null) ? false : true;
    }

    private static ArrayList<AdData> a(Context context, ArrayList<AdData> arrayList) {
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (size > i10) {
            if (com.appnext.core.f.i(context, arrayList.get(size).C())) {
                arrayList.remove(size);
                arrayList.add(0, arrayList.get(size));
                size++;
                i10++;
            }
            size--;
        }
        int size2 = arrayList.size() - 1;
        int i11 = 0;
        while (size2 > i11) {
            if (arrayList.get(size2).getType().equals(AdData.SPONSORED)) {
                arrayList.remove(size2);
                arrayList.add(0, arrayList.get(size2));
                size2++;
                i11++;
            }
            size2--;
        }
        int size3 = arrayList.size() - 1;
        int i12 = 0;
        while (size3 > i12) {
            if (arrayList.get(size3).getType().equals(AdData.SPONSORED) && !com.appnext.core.f.i(context, arrayList.get(size3).C())) {
                arrayList.remove(size3);
                arrayList.add(0, arrayList.get(size3));
                size3++;
                i12++;
            }
            size3--;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.d
    public final void a(String str, String str2, Ad ad) {
        JSONArray jSONArray;
        try {
            jSONArray = new JSONObject(str2).getJSONArray("actions");
        } catch (Throwable unused) {
            if (str2.contains("PackageID '") && str2.contains("' is not in whitelist")) {
                super.a(ActionError.PACKAGE_NOT_APPROVED, str2, ad);
                return;
            }
        }
        if (jSONArray.length() == 0) {
            super.a(str, str2, ad);
            return;
        }
        if (jSONArray.getJSONObject(0).has(xn.a.f21422g) && jSONArray.getJSONObject(0).getString(xn.a.f21422g).equals("package not approved")) {
            super.a(ActionError.PACKAGE_NOT_APPROVED, str2, ad);
            return;
        }
        super.a(str, str2, ad);
    }

    private static int a(Context context, AdData adData) {
        if (!adData.getCptList().equals("") && !adData.getCptList().equals("[]")) {
            try {
                JSONArray jSONArray = new JSONArray(adData.getCptList());
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (com.appnext.core.f.i(context, jSONArray.getString(i10))) {
                        return 0;
                    }
                }
                return 3;
            } catch (JSONException unused) {
            }
        }
        return 0;
    }

    private static AdData a(AdData adData, AdData adData2) {
        return adData.getRevenueType().equals(adData2.getRevenueType()) ? Float.parseFloat(adData.getRevenueRate()) < Float.parseFloat(adData2.getRevenueRate()) ? adData2 : adData : adData.getRevenueType().equals("cpc") ? adData : adData2;
    }

    private static AdData a(ArrayList<AdData> arrayList, AdData adData) {
        Iterator<AdData> it = arrayList.iterator();
        while (it.hasNext()) {
            AdData next = it.next();
            if (next.C().equals(adData.C())) {
                return next;
            }
        }
        return null;
    }

    public final void a(boolean z10) {
        this.Q = false;
    }

    static /* synthetic */ void a(a aVar, String str, String str2, String str3) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url;
        try {
            new File(str2).mkdirs();
            url = new URL(str);
            httpURLConnection = (HttpURLConnection) url.openConnection();
        } catch (Throwable unused) {
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setConnectTimeout(5000);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream(), 1024);
                FileOutputStream fileOutputStream = new FileOutputStream(str2 + str3);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        bufferedInputStream.close();
                        httpURLConnection.disconnect();
                        return;
                    }
                }
            } else {
                throw new HttpRetryException("download error", responseCode, str);
            }
        } catch (Throwable unused2) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }
}
