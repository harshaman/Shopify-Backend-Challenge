PGDMP     3                     z         	   Inventory    14.1    14.1     ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                        0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16397 	   Inventory    DATABASE     V   CREATE DATABASE "Inventory" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'C';
    DROP DATABASE "Inventory";
                postgres    false            ?            1259    16407 	   PriceData    TABLE     ?   CREATE TABLE public."PriceData" (
    "itemPrice" numeric(10,2) NOT NULL,
    "itemTax" numeric(10,2),
    "grossPrice" numeric(10,2),
    "currencyCode" character varying
);
    DROP TABLE public."PriceData";
       public         heap    postgres    false            ?            1259    16410    currency    TABLE     ?   CREATE TABLE public.currency (
    code character varying NOT NULL,
    symbol character varying,
    "curName" character varying
);
    DROP TABLE public.currency;
       public         heap    postgres    false            ?            1259    16398    product    TABLE     ?  CREATE TABLE public.product (
    id integer NOT NULL,
    count integer,
    description character varying,
    name character varying,
    warehouse_code character varying,
    code character varying(255),
    cur_name character varying(255),
    symbol character varying(255),
    gross_price numeric(19,2),
    item_price numeric(19,2),
    item_tax numeric(19,2),
    product_id character varying(255)
);
    DROP TABLE public.product;
       public         heap    postgres    false            ?          0    16407 	   PriceData 
   TABLE DATA           [   COPY public."PriceData" ("itemPrice", "itemTax", "grossPrice", "currencyCode") FROM stdin;
    public          postgres    false    210   ?       ?          0    16410    currency 
   TABLE DATA           ;   COPY public.currency (code, symbol, "curName") FROM stdin;
    public          postgres    false    211   ?       ?          0    16398    product 
   TABLE DATA           ?   COPY public.product (id, count, description, name, warehouse_code, code, cur_name, symbol, gross_price, item_price, item_tax, product_id) FROM stdin;
    public          postgres    false    209          n           2606    16416    currency currency_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.currency
    ADD CONSTRAINT currency_pkey PRIMARY KEY (code);
 @   ALTER TABLE ONLY public.currency DROP CONSTRAINT currency_pkey;
       public            postgres    false    211            ?      x?????? ? ?      ?      x?????? ? ?      ?   d   x?3?41?LI-N.?,(????(?O)M.Q0?ttr?v???,IMQ.I,I-Vp???I,?T??4?30??@"c??9??fH?4C#?????=... `?,i     