package com.applovin.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class k2 extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    protected Context f7386a;

    /* renamed from: b  reason: collision with root package name */
    private List f7387b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private Map f7388c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private a f7389d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void a(d2 d2Var, j2 j2Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public k2(Context context) {
        this.f7386a = context.getApplicationContext();
    }

    protected j2 a() {
        return null;
    }

    public void a(a aVar) {
        this.f7389d = aVar;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    protected abstract int b();

    @Override // android.widget.Adapter
    /* renamed from: b */
    public j2 getItem(int i10) {
        return (j2) this.f7387b.get(i10);
    }

    protected abstract List c(int i10);

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.hb
            @Override // java.lang.Runnable
            public final void run() {
                k2.this.notifyDataSetChanged();
            }
        });
    }

    protected abstract int d(int i10);

    protected abstract j2 e(int i10);

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f7387b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        return getItem(i10).m();
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        i2 i2Var;
        j2 item = getItem(i10);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            i2Var = new i2();
            i2Var.f7204a = (TextView) view.findViewById(16908308);
            i2Var.f7205b = (TextView) view.findViewById(16908309);
            i2Var.f7206c = (ImageView) view.findViewById(R.id.imageView);
            i2Var.f7207d = (ImageView) view.findViewById(R.id.detailImageView);
            view.setTag(i2Var);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            i2Var = (i2) view.getTag();
        }
        i2Var.a(i10);
        i2Var.a(item);
        view.setEnabled(item.o());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return j2.n();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        return getItem(i10).o();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i10;
        this.f7387b = new ArrayList();
        int b10 = b();
        this.f7388c = new HashMap(b10);
        j2 a10 = a();
        if (a10 != null) {
            this.f7387b.add(a10);
            i10 = 1;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < b10; i11++) {
            int d10 = d(i11);
            if (d10 != 0) {
                this.f7387b.add(e(i11));
                this.f7387b.addAll(c(i11));
                this.f7388c.put(Integer.valueOf(i11), Integer.valueOf(i10));
                i10 += d10 + 1;
            }
        }
        this.f7387b.add(new m4(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        i2 i2Var = (i2) view.getTag();
        j2 b10 = i2Var.b();
        d2 a10 = a(i2Var.a());
        a aVar = this.f7389d;
        if (aVar == null || a10 == null) {
            return;
        }
        aVar.a(a10, b10);
    }

    private d2 a(int i10) {
        for (int i11 = 0; i11 < b(); i11++) {
            Integer num = (Integer) this.f7388c.get(Integer.valueOf(i11));
            if (num != null) {
                if (i10 <= num.intValue() + d(i11)) {
                    return new d2(i11, i10 - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(j0.a(R.color.applovin_sdk_highlightListItemColor, this.f7386a));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }
}
