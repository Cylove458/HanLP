/*
 * <summary></summary>
 * <author>He Han</author>
 * <email>me@hankcs.com</email>
 * <create-date>16/2/13 PM9:12</create-date>
 *
 * <copyright file="BagOfWordsDocument.java" company="码农场">
 * Copyright (c) 2008-2016, 码农场. All Right Reserved, http://www.hankcs.com/
 * This source is subject to Hankcs. Please contact Hankcs to get more information.
 * </copyright>
 */
package com.hankcs.hanlp.classification.corpus;

import com.hankcs.hanlp.classification.collections.FrequencyMap;

import java.util.TreeMap;

/**
 * @author hankcs
 */
public class BagOfWordsDocument implements ITermFrequencyHolder
{
    //
    //    /**
    //     * 文档所属的词表
    //     */
    //    private Lexicon lexicon;
    //    /**
    //     * 文档所属的类表
    //     */
    //    private Catalog catalog;

    public FrequencyMap<Integer> tfMap;

    public TreeMap<Integer,String> tfWordMap;

    public BagOfWordsDocument()
    {
        tfMap = new FrequencyMap<Integer>();
        tfWordMap = new TreeMap<Integer, String>();
    }

    public FrequencyMap<Integer> getTfMap()
    {
        return tfMap;
    }

    /**
     * 是否为空(文档中没有任何词)
     * @return
     */
    public boolean isEmpty()
    {
        return tfMap.isEmpty();
    }
}
