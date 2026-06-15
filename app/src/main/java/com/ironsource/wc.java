package com.ironsource;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.uc;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class wc {

    /* renamed from: a  reason: collision with root package name */
    private final Context f21283a;

    /* renamed from: b  reason: collision with root package name */
    private final gb f21284b;

    /* renamed from: c  reason: collision with root package name */
    private final vc f21285c;

    /* renamed from: d  reason: collision with root package name */
    private final pm f21286d;

    /* renamed from: e  reason: collision with root package name */
    private final nf f21287e = mm.S().f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements po {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ po f21288a;

        /* renamed from: com.ironsource.wc$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class C0241a extends JSONObject {
            C0241a() throws JSONException {
                put("lastReferencedTime", System.currentTimeMillis());
            }
        }

        a(po poVar) {
            this.f21288a = poVar;
        }

        @Override // com.ironsource.po
        public void a(nh nhVar) {
            this.f21288a.a(nhVar);
            try {
                wc.this.f21286d.a(nhVar.getName(), new C0241a());
            } catch (Exception e8) {
                o9.d().a(e8);
                IronLog.INTERNAL.error(e8.toString());
            }
        }

        @Override // com.ironsource.po
        public void a(nh nhVar, fh fhVar) {
            this.f21288a.a(nhVar, fhVar);
        }
    }

    public wc(Context context, gb gbVar, vc vcVar, pm pmVar) {
        this.f21283a = context;
        this.f21284b = gbVar;
        this.f21285c = vcVar;
        this.f21286d = pmVar;
    }

    public void a(nh nhVar) throws Exception {
        if (nhVar.exists()) {
            if (!nhVar.delete()) {
                throw new Exception("Failed to delete file");
            }
            this.f21286d.a(nhVar.getName());
        }
    }

    public void a(nh nhVar, String str, int i10, int i11, po poVar) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception(uc.a.f20956a);
        }
        if (this.f21287e.a(this.f21284b.a()) <= 0) {
            throw new Exception(d9.A);
        }
        if (!x8.h(this.f21283a)) {
            throw new Exception(d9.C);
        }
        this.f21285c.a(nhVar.getPath(), new a(poVar));
        if (!nhVar.exists()) {
            this.f21284b.a(nhVar, str, i10, i11, this.f21285c);
            return;
        }
        Message message = new Message();
        message.obj = nhVar;
        message.what = 1015;
        this.f21285c.sendMessage(message);
    }

    public void a(nh nhVar, JSONObject jSONObject) throws Exception {
        if (jSONObject == null) {
            throw new Exception("Missing attributes to update");
        }
        if (!nhVar.exists()) {
            throw new Exception("File does not exist");
        }
        if (!this.f21286d.b(nhVar.getName(), jSONObject)) {
            throw new Exception("Failed to update attribute");
        }
    }

    public void b(nh nhVar) throws Exception {
        if (nhVar.exists()) {
            ArrayList<nh> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(nhVar);
            if (!(IronSourceStorageUtils.deleteFolderContentRecursive(nhVar) && nhVar.delete())) {
                throw new Exception("Failed to delete folder");
            }
            this.f21286d.a(filesInFolderRecursive);
        }
    }

    public JSONObject c(nh nhVar) throws Exception {
        if (nhVar.exists()) {
            return IronSourceStorageUtils.buildFilesMapOfDirectory(nhVar, this.f21286d.b());
        }
        throw new Exception("Folder does not exist");
    }

    public long d(nh nhVar) throws Exception {
        if (nhVar.exists()) {
            return IronSourceStorageUtils.getTotalSizeOfDir(nhVar);
        }
        throw new Exception("Folder does not exist");
    }
}
