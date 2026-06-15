package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.core.view.a0;
import androidx.customview.view.AbsSavedState;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class CheckableImageButton extends androidx.appcompat.widget.p implements Checkable {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f14347g = {16842912};

    /* renamed from: d  reason: collision with root package name */
    private boolean f14348d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14349e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14350f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f14351c;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f14351c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f14351c ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.c cVar) {
            super.g(view, cVar);
            cVar.V(CheckableImageButton.this.a());
            cVar.W(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.C);
    }

    public boolean a() {
        return this.f14349e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f14348d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (this.f14348d) {
            int[] iArr = f14347g;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setChecked(savedState.f14351c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f14351c = this.f14348d;
        return savedState;
    }

    public void setCheckable(boolean z10) {
        if (this.f14349e != z10) {
            this.f14349e = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f14349e || this.f14348d == z10) {
            return;
        }
        this.f14348d = z10;
        refreshDrawableState();
        sendAccessibilityEvent(com.ironsource.mediationsdk.metadata.a.f18931n);
    }

    public void setPressable(boolean z10) {
        this.f14350f = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f14350f) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f14348d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14349e = true;
        this.f14350f = true;
        a0.q0(this, new a());
    }
}
