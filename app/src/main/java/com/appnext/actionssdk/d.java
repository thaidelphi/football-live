package com.appnext.actionssdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d implements ListAdapter {
    private ArrayList<AdData> ads;
    private Context context;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class a {
        ImageView F;
        TextView aI;
        TextView aJ;
        ImageView aK;

        private a() {
        }
    }

    public d(Context context, ArrayList<AdData> arrayList) {
        this.ads = arrayList;
        this.context = context;
    }

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return true;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<AdData> arrayList = this.ads;
        if (arrayList == null) {
            return 0;
        }
        if (arrayList.size() >= 5) {
            return 5;
        }
        if (this.ads.size() < 3) {
            return 3;
        }
        return this.ads.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        return this.ads.get(i10);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i10) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(R.layout.apnxt_action_alert_item, viewGroup, false);
            aVar = new a();
            aVar.F = (ImageView) view.findViewById(R.id.icon);
            aVar.aI = (TextView) view.findViewById(R.id.title);
            aVar.aJ = (TextView) view.findViewById(R.id.desc);
            aVar.aK = (ImageView) view.findViewById(R.id.ad);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        view.setBackgroundColor(-1);
        AdData adData = this.ads.size() > i10 ? this.ads.get(i10) : null;
        if (adData != null) {
            aVar.aJ.setVisibility(0);
            aVar.F.setVisibility(0);
            aVar.aI.setVisibility(0);
            try {
                String C = adData.C();
                aVar.F.setImageDrawable(this.context.getPackageManager().getApplicationIcon(C));
                if (adData.N().equals("")) {
                    aVar.aJ.setText(adData.H());
                } else {
                    aVar.aJ.setText(adData.N());
                }
                aVar.aI.setText(this.context.getPackageManager().getApplicationLabel(this.context.getPackageManager().getApplicationInfo(C, 0)));
            } catch (PackageManager.NameNotFoundException unused) {
                Resources resources = this.context.getResources();
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeFile(this.context.getFilesDir().getAbsolutePath() + "/data/appnext/images/apps/" + adData.C() + ".png"));
                if (bitmapDrawable.getBitmap() != null) {
                    aVar.F.setImageDrawable(bitmapDrawable);
                } else {
                    aVar.F.setImageResource(R.drawable.apnxt_missing_icon);
                }
                if (adData.N().equals("")) {
                    aVar.aJ.setText(adData.G());
                } else {
                    aVar.aJ.setText(adData.N());
                }
                if (aVar.aJ.getText().equals("")) {
                    aVar.aJ.setVisibility(8);
                }
                aVar.aI.setText(adData.getName());
            }
            if (adData.getType() != null && adData.getType().equalsIgnoreCase(AdData.SPONSORED)) {
                Resources resources2 = this.context.getResources();
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources2, BitmapFactory.decodeFile(this.context.getFilesDir().getAbsolutePath() + "/data/appnext/images/icons/ad.png"));
                if (bitmapDrawable2.getBitmap() != null) {
                    aVar.aK.setImageDrawable(bitmapDrawable2);
                }
                aVar.aK.setVisibility(0);
                view.setBackgroundColor(Color.parseColor("#f9f9f9"));
            } else {
                aVar.aK.setVisibility(4);
            }
        } else {
            aVar.aK.setVisibility(4);
            aVar.aJ.setVisibility(4);
            aVar.F.setVisibility(4);
            aVar.aI.setVisibility(4);
        }
        return view;
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return false;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i10) {
        return true;
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }
}
