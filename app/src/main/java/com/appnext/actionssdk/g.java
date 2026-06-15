package com.appnext.actionssdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.ls;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class g {
    private static long bA;
    private static HashMap<String, ActionData> bB = new HashMap<>();
    private static HashMap<String, ArrayList<AdData>> bC = new HashMap<>();
    private static ArrayList<a> bz = new ArrayList<>();
    private static int state;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void error();

        void m();
    }

    private g() {
    }

    public static ActionData F(String str) {
        return bB.get(str);
    }

    public static ArrayList<AdData> G(String str) {
        return bC.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String H(String str) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(new File(str));
        } catch (Throwable unused) {
            fileInputStream = null;
        }
        try {
            String a10 = a(fileInputStream);
            try {
                fileInputStream.close();
                return a10;
            } catch (Throwable unused2) {
                return a10;
            }
        } catch (Throwable unused3) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused4) {
                }
            }
            return "";
        }
    }

    public static void a(String str, ActionData actionData) {
        bB.put(str, actionData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context) {
        try {
            File file = new File(context.getFilesDir() + "/actions/");
            if (!file.exists()) {
                file.mkdir();
            }
            new File(file + "/data.json").delete();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file + "/data.json"));
            outputStreamWriter.write(com.appnext.core.f.a("https://cdn.appnext.com/tools/sdk/actions/actionlist.json", null));
            outputStreamWriter.close();
            return true;
        } catch (Throwable unused) {
            setState(0);
            return false;
        }
    }

    static /* synthetic */ void d(String str, ArrayList arrayList) {
        bC.put(str, arrayList);
    }

    public static boolean isLoaded() {
        return state == 2;
    }

    public static void setState(int i10) {
        state = i10;
        if (i10 == 1) {
            bA = System.currentTimeMillis();
        }
    }

    public static ArrayList<AdData> a(Context context, String str, int i10) {
        ArrayList<AdData> arrayList = new ArrayList<>();
        ArrayList<AdData> arrayList2 = bC.get(str);
        if (arrayList2 != null) {
            Iterator<AdData> it = arrayList2.iterator();
            while (it.hasNext()) {
                AdData next = it.next();
                if (com.appnext.core.f.i(context, next.C())) {
                    next.s(str);
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    private static void c(String str, ArrayList<AdData> arrayList) {
        bC.put(str, arrayList);
    }

    public static void a(final Context context, a aVar) {
        synchronized (bz) {
            if (aVar != null) {
                bz.add(aVar);
            }
            if (bA < System.currentTimeMillis() - 8000) {
                setState(0);
            }
            if (state == 1) {
                return;
            }
            new Thread(new Runnable() { // from class: com.appnext.actionssdk.g.1
                @Override // java.lang.Runnable
                public final void run() {
                    g.setState(1);
                    File file = new File(context.getFilesDir() + "/actions/data.json");
                    if (!file.exists() || file.lastModified() < System.currentTimeMillis() - (((Integer.parseInt(f.y().get("list_timeout")) * 1000) * 60) * 60)) {
                        if (!g.b(context)) {
                            g.setState(0);
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.actionssdk.g.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.addAll(g.bz);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        a aVar2 = (a) it.next();
                                        if (aVar2 != null) {
                                            try {
                                                aVar2.error();
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    }
                                    g.bz.clear();
                                }
                            });
                            return;
                        }
                    } else if (g.state == 2) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.actionssdk.g.1.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                ArrayList arrayList = new ArrayList();
                                arrayList.addAll(g.bz);
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    a aVar2 = (a) it.next();
                                    if (aVar2 != null) {
                                        aVar2.m();
                                    }
                                }
                                g.bz.clear();
                            }
                        });
                        return;
                    }
                    try {
                        JSONArray jSONArray = new JSONObject(g.H(context.getFilesDir() + "/actions/data.json")).getJSONArray(ls.f18303n);
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            ActionData actionData = (ActionData) com.appnext.core.l.a(ActionData.class, jSONObject);
                            if (actionData != null) {
                                JSONArray jSONArray2 = jSONObject.getJSONArray("apps");
                                ArrayList arrayList = new ArrayList();
                                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                                    AdData adData = new AdData();
                                    adData.p(jSONArray2.getString(i11));
                                    arrayList.add(adData);
                                }
                                g.d(actionData.getActionParam(), arrayList);
                            }
                        }
                        g.setState(2);
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.actionssdk.g.1.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.addAll(g.bz);
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    a aVar2 = (a) it.next();
                                    if (aVar2 != null) {
                                        aVar2.m();
                                    }
                                }
                                g.bz.clear();
                            }
                        });
                    } catch (Throwable th) {
                        th.getMessage();
                        g.setState(0);
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.actionssdk.g.1.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.addAll(g.bz);
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    a aVar2 = (a) it.next();
                                    if (aVar2 != null) {
                                        aVar2.error();
                                    }
                                }
                                g.bz.clear();
                            }
                        });
                    }
                }
            }).start();
        }
    }

    private static String a(InputStream inputStream) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }
}
