package pl.droidsonroids.gif;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import pl.droidsonroids.gif.d;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public class GifImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private boolean f29970a;

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(d.c(this, attributeSet, 0, 0));
    }

    private void a(d.a aVar) {
        this.f29970a = aVar.f30023a;
        int i10 = aVar.f30021c;
        if (i10 > 0) {
            super.setImageResource(i10);
        }
        int i11 = aVar.f30022d;
        if (i11 > 0) {
            super.setBackgroundResource(i11);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof GifViewSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        GifViewSavedState gifViewSavedState = (GifViewSavedState) parcelable;
        super.onRestoreInstanceState(gifViewSavedState.getSuperState());
        gifViewSavedState.a(getDrawable(), 0);
        gifViewSavedState.a(getBackground(), 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new GifViewSavedState(super.onSaveInstanceState(), this.f29970a ? getDrawable() : null, this.f29970a ? getBackground() : null);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        if (d.e(this, false, i10)) {
            return;
        }
        super.setBackgroundResource(i10);
    }

    public void setFreezesAnimation(boolean z10) {
        this.f29970a = z10;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        if (d.e(this, true, i10)) {
            return;
        }
        super.setImageResource(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (d.d(this, uri)) {
            return;
        }
        super.setImageURI(uri);
    }
}
