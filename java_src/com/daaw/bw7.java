package com.daaw;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class bw7 extends AbstractList implements RandomAccess, ct7 {

    /* renamed from: p */
    public final ct7 f5236p;

    public bw7(ct7 ct7Var) {
        this.f5236p = ct7Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((bt7) this.f5236p).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new aw7(this);
    }

    @Override // com.daaw.ct7
    /* renamed from: l */
    public final void mo24979l(yq7 yq7Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new zv7(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5236p.size();
    }

    @Override // com.daaw.ct7
    public final ct7 zze() {
        return this;
    }

    @Override // com.daaw.ct7
    public final Object zzf(int i) {
        return this.f5236p.zzf(i);
    }

    @Override // com.daaw.ct7
    public final List zzh() {
        return this.f5236p.zzh();
    }
}
