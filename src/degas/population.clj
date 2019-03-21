(ns degas.population
  (:require [degas.individual :refer :all]))

(defn rand-pop
  [size ind-len ind-gen-fn]
  "Returns a vector, a population of given length, each individual of ind-len length, consisting of genes of gene-len length, consisting of units of u-max arity."
  (apply vector (repeatedly size #(ind-gen-fn ind-len))))

(rand-pop 2 2 rand-unique-ind)
