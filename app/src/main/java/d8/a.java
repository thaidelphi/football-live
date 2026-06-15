package d8;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
/* compiled from: QueryInfoCallback.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class a extends QueryInfoGenerationCallback {

    /* renamed from: a  reason: collision with root package name */
    private String f24400a;

    /* renamed from: b  reason: collision with root package name */
    private v7.a f24401b;

    public a(String str, v7.a aVar) {
        this.f24400a = str;
        this.f24401b = aVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f24401b.onFailure(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f24401b.a(this.f24400a, queryInfo.getQuery(), queryInfo);
    }
}
