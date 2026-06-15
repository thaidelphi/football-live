package z;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: ResourceCursorAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class c extends a {

    /* renamed from: i  reason: collision with root package name */
    private int f33413i;

    /* renamed from: j  reason: collision with root package name */
    private int f33414j;

    /* renamed from: k  reason: collision with root package name */
    private LayoutInflater f33415k;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f33414j = i10;
        this.f33413i = i10;
        this.f33415k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // z.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f33415k.inflate(this.f33414j, viewGroup, false);
    }

    @Override // z.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f33415k.inflate(this.f33413i, viewGroup, false);
    }
}
