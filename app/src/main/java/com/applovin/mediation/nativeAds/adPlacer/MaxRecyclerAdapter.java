package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.applovin.impl.v4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxRecyclerAdapter extends RecyclerView.h<RecyclerView.c0> implements MaxAdPlacer.Listener {

    /* renamed from: a  reason: collision with root package name */
    private final MaxAdPlacer f9935a;

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView.h f9936b;

    /* renamed from: c  reason: collision with root package name */
    private final b f9937c;

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView f9938d;

    /* renamed from: e  reason: collision with root package name */
    private v4 f9939e;

    /* renamed from: f  reason: collision with root package name */
    private MaxAdPlacer.Listener f9940f;

    /* renamed from: g  reason: collision with root package name */
    private int f9941g;

    /* renamed from: h  reason: collision with root package name */
    private AdPositionBehavior f9942h;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class MaxAdRecyclerViewHolder extends RecyclerView.c0 {

        /* renamed from: a  reason: collision with root package name */
        private final ViewGroup f9944a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f9944a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f9944a;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements v4.a {
        a() {
        }

        @Override // com.applovin.impl.v4.a
        public void a(int i10, int i11) {
            MaxRecyclerAdapter.this.f9935a.updateFillablePositions(i10, Math.min(i11 + MaxRecyclerAdapter.this.f9941g, MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private class b extends RecyclerView.j {
        private b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeChanged(int i10, int i11) {
            int adjustedPosition = MaxRecyclerAdapter.this.f9935a.getAdjustedPosition(i10);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f9935a.getAdjustedPosition((i10 + i11) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeInserted(int i10, int i11) {
            boolean z10 = i10 + i11 >= MaxRecyclerAdapter.this.f9936b.getItemCount();
            if (MaxRecyclerAdapter.this.f9942h != AdPositionBehavior.FIXED && (MaxRecyclerAdapter.this.f9942h != AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND || !z10)) {
                int adjustedPosition = MaxRecyclerAdapter.this.f9935a.getAdjustedPosition(i10);
                for (int i12 = 0; i12 < i11; i12++) {
                    MaxRecyclerAdapter.this.f9935a.insertItem(adjustedPosition);
                }
                MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i11);
                return;
            }
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeMoved(int i10, int i11, int i12) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onItemRangeRemoved(int i10, int i11) {
            int itemCount = MaxRecyclerAdapter.this.f9936b.getItemCount();
            boolean z10 = i10 + i11 >= itemCount;
            if (MaxRecyclerAdapter.this.f9942h != AdPositionBehavior.FIXED && (MaxRecyclerAdapter.this.f9942h != AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND || !z10)) {
                int adjustedPosition = MaxRecyclerAdapter.this.f9935a.getAdjustedPosition(i10);
                int adjustedCount = MaxRecyclerAdapter.this.f9935a.getAdjustedCount(itemCount + i11);
                for (int i12 = 0; i12 < i11; i12++) {
                    MaxRecyclerAdapter.this.f9935a.removeItem(adjustedPosition);
                }
                int adjustedCount2 = MaxRecyclerAdapter.this.f9935a.getAdjustedCount(itemCount);
                int i13 = adjustedCount - adjustedCount2;
                Collection<Integer> clearTrailingAds = MaxRecyclerAdapter.this.f9935a.clearTrailingAds(adjustedCount2 - 1);
                if (!clearTrailingAds.isEmpty()) {
                    i13 += clearTrailingAds.size();
                }
                MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (i13 - i11), i13);
                return;
            }
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        /* synthetic */ b(MaxRecyclerAdapter maxRecyclerAdapter, a aVar) {
            this();
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.h hVar, Activity activity) {
        b bVar = new b(this, null);
        this.f9937c = bVar;
        this.f9941g = 8;
        this.f9942h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f9935a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(hVar.hasStableIds());
        this.f9936b = hVar;
        hVar.registerAdapterDataObserver(bVar);
    }

    public void destroy() {
        try {
            this.f9936b.unregisterAdapterDataObserver(this.f9937c);
        } catch (Exception unused) {
        }
        this.f9935a.destroy();
        v4 v4Var = this.f9939e;
        if (v4Var != null) {
            v4Var.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f9935a;
    }

    public int getAdjustedPosition(int i10) {
        return this.f9935a.getAdjustedPosition(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f9935a.getAdjustedCount(this.f9936b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        if (this.f9936b.hasStableIds()) {
            if (this.f9935a.isFilledPosition(i10)) {
                return this.f9935a.getAdItemId(i10);
            }
            return this.f9936b.getItemId(this.f9935a.getOriginalPosition(i10));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (this.f9935a.isAdPosition(i10)) {
            return -42;
        }
        return this.f9936b.getItemViewType(this.f9935a.getOriginalPosition(i10));
    }

    public int getOriginalPosition(int i10) {
        return this.f9935a.getOriginalPosition(i10);
    }

    public void loadAds() {
        this.f9935a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f9940f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i10) {
        notifyItemChanged(i10);
        MaxAdPlacer.Listener listener = this.f9940f;
        if (listener != null) {
            listener.onAdLoaded(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i10) {
        MaxAdPlacer.Listener listener = this.f9940f;
        if (listener != null) {
            listener.onAdRemoved(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f9940f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f9938d = recyclerView;
        v4 v4Var = new v4(recyclerView);
        this.f9939e = v4Var;
        v4Var.a(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.c0 c0Var, int i10) {
        int dpToPx;
        int dpToPx2;
        this.f9939e.a(c0Var.itemView, i10);
        if (this.f9935a.isAdPosition(i10)) {
            AppLovinSdkUtils.Size adSize = this.f9935a.getAdSize(i10, a(i10));
            ViewGroup containerView = ((MaxAdRecyclerViewHolder) c0Var).getContainerView();
            ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
            if (adSize != AppLovinSdkUtils.Size.ZERO) {
                if (adSize.getWidth() < 0) {
                    dpToPx = adSize.getWidth();
                } else {
                    dpToPx = AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
                }
                layoutParams.width = dpToPx;
                if (adSize.getHeight() < 0) {
                    dpToPx2 = adSize.getHeight();
                } else {
                    dpToPx2 = AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
                }
                layoutParams.height = dpToPx2;
                containerView.setLayoutParams(layoutParams);
                this.f9935a.renderAd(i10, containerView);
                return;
            }
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
            return;
        }
        this.f9936b.onBindViewHolder(c0Var, this.f9935a.getOriginalPosition(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == -42) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            RecyclerView.p layoutManager = this.f9938d.getLayoutManager();
            if (layoutManager != null && layoutManager.k()) {
                layoutParams.width = -2;
                layoutParams.height = -1;
            } else {
                layoutParams.width = -1;
                layoutParams.height = -2;
            }
            inflate.setLayoutParams(layoutParams);
            return new MaxAdRecyclerViewHolder(inflate);
        }
        return this.f9936b.onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f9938d = null;
        v4 v4Var = this.f9939e;
        if (v4Var != null) {
            v4Var.a();
            this.f9939e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public boolean onFailedToRecycleView(RecyclerView.c0 c0Var) {
        if (c0Var instanceof MaxAdRecyclerViewHolder) {
            return super.onFailedToRecycleView(c0Var);
        }
        return this.f9936b.onFailedToRecycleView(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(RecyclerView.c0 c0Var) {
        if (c0Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(c0Var);
        } else {
            this.f9936b.onViewAttachedToWindow(c0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(RecyclerView.c0 c0Var) {
        if (c0Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(c0Var);
        } else {
            this.f9936b.onViewDetachedFromWindow(c0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(RecyclerView.c0 c0Var) {
        v4 v4Var = this.f9939e;
        if (v4Var != null) {
            v4Var.b(c0Var.itemView);
        }
        if (c0Var instanceof MaxAdRecyclerViewHolder) {
            if (this.f9935a.isFilledPosition(c0Var.getBindingAdapterPosition())) {
                ((MaxAdRecyclerViewHolder) c0Var).getContainerView().removeAllViews();
            }
            super.onViewRecycled(c0Var);
            return;
        }
        this.f9936b.onViewRecycled(c0Var);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f9942h = adPositionBehavior;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void setHasStableIds(boolean z10) {
        super.setHasStableIds(z10);
        this.f9936b.unregisterAdapterDataObserver(this.f9937c);
        this.f9936b.setHasStableIds(z10);
        this.f9936b.registerAdapterDataObserver(this.f9937c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f9940f = listener;
    }

    public void setLookAhead(int i10) {
        this.f9941g = i10;
    }

    private int a(int i10) {
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f9938d.getContext(), this.f9938d.getWidth());
        RecyclerView.p layoutManager = this.f9938d.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            return layoutManager instanceof StaggeredGridLayoutManager ? pxToDp / ((StaggeredGridLayoutManager) layoutManager).q2() : pxToDp;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        return (pxToDp / gridLayoutManager.T2()) * gridLayoutManager.X2().f(i10);
    }
}
