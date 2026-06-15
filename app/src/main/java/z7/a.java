package z7;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
/* compiled from: QueryInfoCallback.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class a extends QueryInfoGenerationCallback {

    /* renamed from: a  reason: collision with root package name */
    private String f33722a;

    /* renamed from: b  reason: collision with root package name */
    private v7.a f33723b;

    public a(String str, v7.a aVar) {
        this.f33722a = str;
        this.f33723b = aVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f33723b.onFailure(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f33723b.a(this.f33722a, queryInfo.getQuery(), queryInfo);
    }
}
