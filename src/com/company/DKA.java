package com.company;

import java.util.*;

public class DKA<T, E> implements DkaMethods<T> {
    private Set<T> alphabet;
    private Set<E> Q;
    private E q0;
    private Set<E> F;
    private Map<Pair<T, E>, Pair<T, E>> delta;

    public DKA(Set<T> alphabet, Set<E> Q, E q0, Set<E> F, Map<Pair<T, E>, Pair<T, E>> delta) {
        setDelta(delta);
        setF(F);
        setQ(Q);
        setQ0(q0);
        setAlphabet(alphabet);
    }

    public Collection<T> action(final Iterable<T> request) throws DkaException {
         List<T> answer= new ArrayList<>();

        for ( T letter : request) {
            Pair<T, E> currentPair = new Pair(letter, this.q0);
            //System.out.print(delta.keySet());
        //    System.out.print(currentPair.getFirt()+" "+currentPair.getSecond());
            if (delta.containsKey(currentPair)) {
                this.q0 = delta.get(currentPair).getSecond();
                answer.add(delta.get(currentPair).getFirt());
            } else {
                throw new DkaException(DkaErrorCode.WRONG_IN_FUNCTION_STEP);
            }
        }
        return answer;
    }

    //set get
    public void setDelta(Map<Pair<T, E>, Pair<T, E>> delta) {
        this.delta = delta;
    }

    public void setF(Set<E> f) {
        F = f;
    }

    public void setQ(Set<E> q) {
        Q = q;
    }

    public void setQ0(E q0) {
        this.q0 = q0;
    }

    public void setAlphabet(Set<T> alphabet) {
        this.alphabet = alphabet;
    }

    public E getQ0() {
        return q0;
    }

    public Map<Pair<T, E>, Pair<T, E>> getDelta() {
        return delta;
    }

    public Set<E> getF() {
        return F;
    }

    public Set<E> getQ() {
        return Q;
    }

    public Set<T> getAlphabet() {
        return alphabet;
    }
}
