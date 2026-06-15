package com.appnext.actionssdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.appnext.actionssdk.callback.OnActionClosed;
import com.appnext.actionssdk.callback.OnActionError;
import com.appnext.actionssdk.callback.OnActionOpened;
import com.appnext.actionssdk.callback.OnActionsLoaded;
import com.appnext.actionssdk.callback.OnAppClicked;
import com.appnext.actionssdk.g;
import com.appnext.core.Ad;
import com.appnext.core.AppnextError;
import com.appnext.core.callbacks.OnAdClicked;
import com.appnext.core.callbacks.OnAdClosed;
import com.appnext.core.callbacks.OnAdError;
import com.appnext.core.callbacks.OnAdOpened;
import com.appnext.core.d;
import com.appnext.core.p;
import com.appnext.core.webview.AppnextWebView;
import com.ironsource.yk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ActionSDK {
    public static final int ACTION_DIALOG = 431;
    public static final int ACTION_DRAWER = 871;
    protected static boolean aM = true;
    protected static ActionAd aT;
    private static MomentsCallback aU;
    private ActionAd aN;
    private Moment aO;
    private OnAppClicked aP;
    private OnActionError aQ;
    private OnActionClosed aR;
    private OnActionOpened aS;
    private Context context;
    private String placementID;

    /* renamed from: com.appnext.actionssdk.ActionSDK$11  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    final class AnonymousClass11 implements Runnable {
        final /* synthetic */ int bc;

        AnonymousClass11(int i10) {
            this.bc = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionSDK.aT = ActionSDK.this.aN;
            ActionSDK.this.aN.showAd(this.bc);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface MomentsCallback {
        void onReceive(ArrayList<ActionData> arrayList);
    }

    public ActionSDK(final Context context, String str) {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        }
        if (str != null) {
            this.context = context;
            ActionAd actionAd = new ActionAd(this.context, str);
            this.aN = actionAd;
            f(actionAd);
            Moment moment = new Moment(this.context, str);
            this.aO = moment;
            f(moment);
            this.placementID = str;
            new Thread(new Runnable() { // from class: com.appnext.actionssdk.ActionSDK.1
                @Override // java.lang.Runnable
                public final void run() {
                    f.y().a(context, new p.a() { // from class: com.appnext.actionssdk.ActionSDK.1.1
                        public final void a(HashMap<String, Object> hashMap) {
                            g.a(context, (g.a) null);
                        }

                        public final void error(String str2) {
                            g.a(context, (g.a) null);
                        }
                    });
                }
            }).start();
            return;
        }
        throw new IllegalArgumentException("placementID cannot be null");
    }

    public static void setUseDefaultIcons(boolean z10) {
        aM = z10;
    }

    protected static MomentsCallback w() {
        return aU;
    }

    public void actionDisplayed(ActionData actionData) {
        try {
            c.a(this.context, "displayed", new JSONObject().put("pid", this.placementID).put("actions", new JSONArray().put(new JSONObject().put("action", actionData.getActionParam()).put("acid", actionData.o()))).toString());
        } catch (Throwable unused) {
        }
    }

    public String getActionIconColor() {
        return this.aN.getActionColor();
    }

    public OnActionClosed getOnActionClosedCallback() {
        return this.aR;
    }

    public OnActionOpened getOnActionOpenedCallback() {
        return this.aS;
    }

    public OnActionError getOnAdErrorCallback() {
        return this.aQ;
    }

    public OnAppClicked getOnAppClickedCallback() {
        return this.aP;
    }

    public boolean isActionLoaded(String str) {
        this.aN.setCategories(str);
        return a.j().e(this.aN);
    }

    public void loadActions(final OnActionsLoaded onActionsLoaded, final String... strArr) {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() { // from class: com.appnext.actionssdk.ActionSDK.7
            @Override // java.lang.Runnable
            public final void run() {
                ActionSDK.a(ActionSDK.this, strArr);
                ActionSDK actionSDK = ActionSDK.this;
                actionSDK.a(actionSDK.aN, onActionsLoaded, strArr);
            }
        }, 3000L);
        f.y().a(this.context, new p.a() { // from class: com.appnext.actionssdk.ActionSDK.8
            public final void a(HashMap<String, Object> hashMap) {
                handler.removeCallbacksAndMessages(null);
                ActionSDK.a(ActionSDK.this, strArr);
                ActionSDK actionSDK = ActionSDK.this;
                actionSDK.a(actionSDK.aN, onActionsLoaded, strArr);
            }

            public final void error(String str) {
                handler.removeCallbacksAndMessages(null);
                ActionSDK.a(ActionSDK.this, strArr);
                ActionSDK actionSDK = ActionSDK.this;
                actionSDK.a(actionSDK.aN, onActionsLoaded, strArr);
            }
        });
    }

    public void loadMoments(final OnActionsLoaded onActionsLoaded) {
        f.y().a(this.context, new p.a() { // from class: com.appnext.actionssdk.ActionSDK.9
            public final void a(HashMap<String, Object> hashMap) {
                ActionSDK actionSDK = ActionSDK.this;
                actionSDK.a(actionSDK.aO, onActionsLoaded, (String[]) null);
            }

            public final void error(String str) {
                ActionSDK actionSDK = ActionSDK.this;
                actionSDK.a(actionSDK.aO, onActionsLoaded, (String[]) null);
            }
        });
    }

    public void onDestroy() {
        this.aN.destroy();
        this.aO.destroy();
        this.context = null;
        this.aP = null;
        this.aQ = null;
        this.aR = null;
        this.aS = null;
    }

    public void setActionIconColor(String str) {
        this.aO.setActionColor(str);
        this.aN.setActionColor(str);
    }

    public void setLanguage(String str) {
        this.aN.setLang(str);
        this.aO.setLang(str);
    }

    public void setOnActionClosedCallback(OnActionClosed onActionClosed) {
        this.aR = onActionClosed;
    }

    public void setOnActionErrorCallback(OnActionError onActionError) {
        this.aQ = onActionError;
    }

    public void setOnActionOpenedCallback(OnActionOpened onActionOpened) {
        this.aS = onActionOpened;
    }

    public void setOnAppClickedCallback(OnAppClicked onAppClicked) {
        this.aP = onAppClicked;
    }

    public void setParams(String str, String str2) {
        f.y().a(str, str2);
    }

    public void showAction(final String str) {
        if (this.context == null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.actionssdk.ActionSDK.10
                @Override // java.lang.Runnable
                public final void run() {
                    if (ActionSDK.this.getOnAdErrorCallback() != null) {
                        ActionSDK.this.getOnAdErrorCallback().actionError(str, AppnextError.NULL_CONTEXT);
                    }
                }
            });
            return;
        }
        this.aN.setCategories(str);
        ArrayList<?> f10 = a.j().f(this.aN);
        ActionData F = g.F(str);
        if (f10 != null && f10.size() != 0) {
            if (F != null && F.getExpireMillis() < System.currentTimeMillis()) {
                try {
                    c.a(this.context, "expired", new JSONObject().put("pid", this.placementID).put("actions", new JSONArray().put(new JSONObject().put("action", str).put("acid", ((AdData) f10.get(0)).I()))).toString());
                } catch (Throwable unused) {
                }
            }
            try {
                c.a(this.context, "clicked", new JSONObject().put("pid", this.placementID).put("actions", new JSONArray().put(new JSONObject().put("action", str).put("acid", ((AdData) f10.get(0)).I()))).toString());
            } catch (Throwable unused2) {
            }
            new Handler(Looper.getMainLooper()).post(new AnonymousClass11(ACTION_DIALOG));
            return;
        }
        OnActionError onActionError = this.aQ;
        if (onActionError != null) {
            onActionError.actionError(str, ActionError.ACTION_NOT_READY);
        }
    }

    public void startMomentCallback(MomentsCallback momentsCallback) {
        k.i(this).a(this.aO, momentsCallback);
    }

    public void stopMomentCallback() {
        k.i(null).stop();
    }

    private void f(final ActionAd actionAd) {
        actionAd.setOnAdErrorCallback(new OnAdError() { // from class: com.appnext.actionssdk.ActionSDK.12
            @Override // com.appnext.core.callbacks.OnAdError
            public final void adError(String str) {
                if (ActionSDK.this.aQ != null) {
                    ActionSDK.this.aQ.actionError(actionAd.getCategories(), str);
                }
            }
        });
        actionAd.setOnAdOpenedCallback(new OnAdOpened() { // from class: com.appnext.actionssdk.ActionSDK.2
            @Override // com.appnext.core.callbacks.OnAdOpened
            public final void adOpened() {
                if (ActionSDK.this.aS != null) {
                    ActionSDK.this.aS.actionOpened();
                }
            }
        });
        actionAd.setOnAdClickedCallback(new OnAdClicked() { // from class: com.appnext.actionssdk.ActionSDK.3
            @Override // com.appnext.core.callbacks.OnAdClicked
            public final void adClicked() {
                if (ActionSDK.this.aP != null) {
                    ActionSDK.this.aP.appClicked();
                }
            }
        });
        actionAd.setOnAdClosedCallback(new OnAdClosed() { // from class: com.appnext.actionssdk.ActionSDK.4
            @Override // com.appnext.core.callbacks.OnAdClosed
            public final void onAdClosed() {
                if (ActionSDK.this.aR != null) {
                    ActionSDK.this.aR.actionClosed();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Ad ad, final OnActionsLoaded onActionsLoaded, final String[] strArr) {
        if (this.context == null) {
            return;
        }
        a.j().a(this.context, ad instanceof Moment ? new Moment(ad) : new ActionAd(ad), ad.getPlacementID(), new d.a() { // from class: com.appnext.actionssdk.ActionSDK.5
            @Override // com.appnext.core.d.a
            public final <T> void a(T t10) {
                List arrayList;
                if (t10 == null) {
                    if (ad.getOnAdErrorCallback() != null) {
                        ad.getOnAdErrorCallback().adError(AppnextError.NO_ADS);
                        return;
                    }
                    return;
                }
                HashMap hashMap = new HashMap();
                Iterator it = ((ArrayList) t10).iterator();
                while (it.hasNext()) {
                    AdData adData = (AdData) it.next();
                    hashMap.put(adData.getAction(), adData.I());
                }
                ArrayList<ActionData> arrayList2 = new ArrayList<>();
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                String[] strArr2 = strArr;
                if (strArr2 != null && strArr2.length > 0) {
                    arrayList = Arrays.asList(strArr2);
                } else {
                    arrayList = new ArrayList();
                }
                for (String str : hashMap.keySet()) {
                    if (arrayList.size() <= 0 || arrayList.contains(str)) {
                        ActionData F = g.F(str);
                        if (F != null) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("action", str);
                                jSONObject2.put("acid", hashMap.get(str));
                                jSONArray.put(jSONObject2);
                            } catch (Throwable unused) {
                            }
                            ActionData actionData = new ActionData(F);
                            actionData.l(((ActionAd) ad).getActionColor());
                            if (actionData.getActionIcon(ActionSDK.this.context) != null) {
                                arrayList2.add(actionData);
                            }
                        }
                    }
                }
                ArrayList<ActionData> l10 = ad instanceof Moment ? a.j().l() : null;
                if ((arrayList2.size() == 0 && l10 == null) || (arrayList2.size() == 0 && l10 != null && l10.size() == 0)) {
                    ad.setCategories("");
                    if (ad.getOnAdErrorCallback() != null) {
                        ad.getOnAdErrorCallback().adError(AppnextError.NO_ADS);
                        return;
                    }
                    return;
                }
                try {
                    jSONObject.put("actions", jSONArray);
                    jSONObject.put("pid", ActionSDK.this.placementID);
                    c.a(ActionSDK.this.context, "cached", jSONObject.toString());
                } catch (Throwable unused2) {
                }
                if (onActionsLoaded != null) {
                    if (l10 != null) {
                        ActionSDK.a(ActionSDK.this, l10, arrayList2);
                    }
                    Iterator<ActionData> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().l(((ActionAd) ad).getActionColor());
                    }
                    onActionsLoaded.onActionsLoaded(arrayList2);
                }
            }

            @Override // com.appnext.core.d.a
            public final void error(String str) {
                if (ad instanceof Moment) {
                    ArrayList<ActionData> l10 = a.j().l();
                    if (l10.size() > 0) {
                        Iterator<ActionData> it = l10.iterator();
                        while (it.hasNext()) {
                            it.next().l(((ActionAd) ad).getActionColor());
                        }
                        OnActionsLoaded onActionsLoaded2 = onActionsLoaded;
                        if (onActionsLoaded2 != null) {
                            onActionsLoaded2.onActionsLoaded(l10);
                            return;
                        }
                        return;
                    }
                }
                ad.setCategories("");
                if (ad.getOnAdErrorCallback() != null) {
                    ad.getOnAdErrorCallback().adError(str);
                }
            }
        });
        AppnextWebView.B(this.context).a(((ActionAd) ad).I, (AppnextWebView.c) null);
    }

    private static ArrayList<ActionData> a(ArrayList<ActionData> arrayList, ArrayList<ActionData> arrayList2) {
        Iterator<ActionData> it = arrayList.iterator();
        while (it.hasNext()) {
            ActionData next = it.next();
            boolean z10 = false;
            Iterator<ActionData> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (it2.next().getActionParam().equals(next.getActionParam())) {
                    z10 = true;
                }
            }
            if (!z10) {
                arrayList2.add(new ActionData(next));
            }
        }
        return arrayList2;
    }

    public void actionDisplayed(final String str) {
        new Thread(new Runnable() { // from class: com.appnext.actionssdk.ActionSDK.6
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("action", str);
                    hashMap.put(yk.f21552b, com.appnext.core.f.b(ActionSDK.this.context.getApplicationContext(), false));
                    hashMap.put("avid", Action.VID);
                    hashMap.put("app_package", ActionSDK.this.context.getPackageName());
                    hashMap.put("pid", ActionSDK.this.placementID);
                    com.appnext.core.f.a("https://api.appnxt.net/api/actions/impression", hashMap);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Ad ad, OnActionsLoaded onActionsLoaded) {
        a(ad, onActionsLoaded, (String[]) null);
    }

    protected final void a(String str, int i10) {
        this.aN.setCategories(str);
        ArrayList<?> f10 = a.j().f(this.aN);
        ActionData F = g.F(str);
        if (f10 != null && f10.size() != 0) {
            if (F != null && F.getExpireMillis() < System.currentTimeMillis()) {
                try {
                    c.a(this.context, "expired", new JSONObject().put("pid", this.placementID).put("actions", new JSONArray().put(new JSONObject().put("action", str).put("acid", ((AdData) f10.get(0)).I()))).toString());
                } catch (Throwable unused) {
                }
            }
            try {
                c.a(this.context, "clicked", new JSONObject().put("pid", this.placementID).put("actions", new JSONArray().put(new JSONObject().put("action", str).put("acid", ((AdData) f10.get(0)).I()))).toString());
            } catch (Throwable unused2) {
            }
            new Handler(Looper.getMainLooper()).post(new AnonymousClass11(ACTION_DIALOG));
            return;
        }
        OnActionError onActionError = this.aQ;
        if (onActionError != null) {
            onActionError.actionError(str, ActionError.ACTION_NOT_READY);
        }
    }

    private void a(String[] strArr) {
        if (strArr == null) {
            this.aN.setCategories("");
            return;
        }
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
            String str2 = f.y().get("pair_" + str);
            if (str2 != null && !str2.equals("")) {
                hashSet.addAll(Arrays.asList(str2.split(",")));
            }
        }
        String hashSet2 = hashSet.toString();
        this.aN.setCategories(hashSet2.substring(1, hashSet2.length() - 1).replace(" ", ""));
    }

    static /* synthetic */ ArrayList a(ActionSDK actionSDK, ArrayList arrayList, ArrayList arrayList2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActionData actionData = (ActionData) it.next();
            boolean z10 = false;
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((ActionData) it2.next()).getActionParam().equals(actionData.getActionParam())) {
                    z10 = true;
                }
            }
            if (!z10) {
                arrayList2.add(new ActionData(actionData));
            }
        }
        return arrayList2;
    }

    static /* synthetic */ void a(ActionSDK actionSDK, String[] strArr) {
        if (strArr == null) {
            actionSDK.aN.setCategories("");
            return;
        }
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
            String str2 = f.y().get("pair_" + str);
            if (str2 != null && !str2.equals("")) {
                hashSet.addAll(Arrays.asList(str2.split(",")));
            }
        }
        String hashSet2 = hashSet.toString();
        actionSDK.aN.setCategories(hashSet2.substring(1, hashSet2.length() - 1).replace(" ", ""));
    }
}
