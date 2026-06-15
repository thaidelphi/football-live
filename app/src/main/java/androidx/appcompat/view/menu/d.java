package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;
/* compiled from: MenuAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    e f1133a;

    /* renamed from: b  reason: collision with root package name */
    private int f1134b = -1;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1135c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f1136d;

    /* renamed from: e  reason: collision with root package name */
    private final LayoutInflater f1137e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1138f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f1136d = z10;
        this.f1137e = layoutInflater;
        this.f1133a = eVar;
        this.f1138f = i10;
        a();
    }

    void a() {
        g v10 = this.f1133a.v();
        if (v10 != null) {
            ArrayList<g> z10 = this.f1133a.z();
            int size = z10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (z10.get(i10) == v10) {
                    this.f1134b = i10;
                    return;
                }
            }
        }
        this.f1134b = -1;
    }

    public e b() {
        return this.f1133a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public g getItem(int i10) {
        ArrayList<g> z10 = this.f1136d ? this.f1133a.z() : this.f1133a.E();
        int i11 = this.f1134b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return z10.get(i10);
    }

    public void d(boolean z10) {
        this.f1135c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> z10 = this.f1136d ? this.f1133a.z() : this.f1133a.E();
        if (this.f1134b < 0) {
            return z10.size();
        }
        return z10.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1137e.inflate(this.f1138f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1133a.F() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f1135c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
