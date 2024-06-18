-- MySQL dump 10.16  Distrib 10.1.34-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: gestionapprenantcaffab
-- ------------------------------------------------------
-- Server version	10.1.34-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `gestionapprenantcaffab`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `gestionapprenantcaffab` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `gestionapprenantcaffab`;

--
-- Table structure for table `apprenants`
--

DROP TABLE IF EXISTS `apprenants`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `apprenants` (
  `id_apprenant` int(11) NOT NULL AUTO_INCREMENT,
  `matricule` varchar(20) NOT NULL,
  `nom_apprenant` varchar(25) NOT NULL,
  `prenom_apprenant` varchar(40) NOT NULL,
  `genre_apprenant` varchar(15) NOT NULL,
  `tel_apprenant` varchar(12) NOT NULL,
  `photo` longblob NOT NULL,
  PRIMARY KEY (`id_apprenant`),
  UNIQUE KEY `tel_apprenant` (`tel_apprenant`),
  UNIQUE KEY `matricule` (`matricule`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `apprenants`
--

LOCK TABLES `apprenants` WRITE;
/*!40000 ALTER TABLE `apprenants` DISABLE KEYS */;
INSERT INTO `apprenants` VALUES (2,'A001','SANG','THAL','Masculin','1122','�PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0{\0\0\0s\0\0\0��}\0\0\0sRGB\0���\0\0\0gAMA\0\0���a\0\0\0	pHYs\0\0�\0\0��o�d\0\0�IDATx^�݇�ܶ���_rYr�r�9g[�Q��uX�n�Cq�kIC�v�-��@t_t��s���v�VO�O<q^~���Q�W��\'�|���}�y�E�G�*�F֣�>zNj��В��ٖ�/�O=�Ԅ�1y���Z�F�cH�|�G��!��Ւ_��n���^k�jɮ���~��*�4p��<�N��%	��^�;�a8���[Q_��}���_���ڳ���3��}������?|x衇��z�駧ן{��/�px饗&����\\�q���>�G��xs�瘆��k�*����x`q��+�^����o�}����}���믿>|��w�~����o�~���Ï?�8]���/�~����������ϟ7 �&���hXu�~�����y�o�y���\'�駉�?���������Kq���	\Z�7�|35����\ZY\Z֚0$�\Z��R�Ff��9�}o����/���_��ȟ�9E\rI�w�V�De?��I6�a@e<e�+#���H@F�w���)��=D��>����K}�Uݠ��#ax���ސ���^{m\"���<p.K4$݂�]cC�:�aB�U�0$�1\Z��5dX^��B,����_nݺuN���4������?���S���¨���d;V�T�_f�,�V��ڽJm4�iX���}%����W_����\"{D�1ڋ/�8T�����\0���{���uψ��s\r���?��{���+\"��1���M*ׂ{���ǵ�F�~��zk�1���.dW�M���:��M���H�rǖ�=w/��o�����/3��э��=�nd��Bp�h�\Z<�������?ܼys�zj�p�dȦ(�k+W��ʒ����j\"�!����_ER/H��5N}�yw��FG�������J6d&,���3!���$u��h ��}�Ѥw��?g�c��H��o����`�e�������e��B�x1��{ޭ���l׭4ɼy\nr^��G�ZE]�;�nHF�w�Y�N�$�yvZ;#P�p�ҢU*F�1��Hd�է�+Ї^��klP�K�[��\'i���ati�V��R��>&;o�cK�ـ`�#�z���րk�x9�_��DC7��Wj1L���!�~��=�w0D�m��re\n�,t�C2�Y��d�8EҜW󂭑�����w�$ٲT�M1P�	��I(�/Ϟ�˱ѭ������[�dmXū�ʒ�BvE�%A�Z1��$���������dv٧]�-	}*�\Z�mU��OƳJ��\'熩�-�z�`���W��Ǳ��}D��.��^;�G��삝�e��}D��.��^]�67��!�8;�0�|͂`�N��ֶ�q�6�DW���-��0���	�$�A��=��.d�9�V��xt��f��A#v��1��Of�˜��)�w�yg2��÷@vD:ُf- �W�,�na\\�\r��+��[\n�����/�LOo@��-�ئ#A��F��[���Q��m�ݖD7�m�Go���#}���������g���J�S^�D���rz[מ��1хl��!����V$�F�+�V��lsLt!;�)Q�5��$�9F��\"[-K%![H���M9���s�6�D�0��2��1H��-rCv2r���>=g�c��f�체ے� �V$dz�,#�S�9�]�6�2ehuB���^)G?��1?ޅl�GB�\'� 1�VB8�N$�馌Dz,sv�4��Y%FIruFm�R����^�d���C�����-%gDӍ^��UȜM��n}�E�m�U/Y��:B�d����/��ZӦZ�\'��g+�]��^3Y�u��Y�F4eC�e�<Nz�B/ON��)1��I�z9\ne׮]��GKoɳ�ш�Ct�/\'����\\�{�\ry������G[������섵�v�g�1V��VF�|�h�z�hzЇ��Y��]Ⱦ��d�s�l���ԣ�E9I��5{�jĈ6��s�C�-C�4��9�싢ND���\0}oN$���̛[��h$�3��:w��N��nə�Nv�0\nI<h-d�H�����H�|\"�1d��}lI6ِ�����B�R�x��F`�Hb�Ep%z\'���x��7�f̀T���Z�sk�6fī��>ۨ���I6�O4!�\Z4�D�D��t^-*y m��D��w�b�w�Q�B�E�Ғ�:9��a��	�#ah�y�f�B�H^M�\'\rQ�a�%l�:��a�8���@�<�\"Iҵ�y}Ӣr\ru�	C���-�¢]-	�H�6�\'=���`X���yy~hqa���	��@4T:���C���Oq�\"I;��C������;�WD���r	C*[$1�Ad�	ߩ�c�:\Z�%x�ň��73p��\Z�SZ�-�U��u����!ɾ�Q.�3x�Г0��<���	O�[	�#�J�%C�F�E��A��C�2���u$��lӑ�%����,��N�0V��q���ֻ7VI�}�~BS��,Iv~�#�Dl<ѣz�*�f��c�w��%4���o�W����޽�J��N�9�a	����>Y�Jb���U�\r2�vq$d�Ï)&R4:$�Bz���P=$�9�Q�;Yw�u\\j�y���������V�������Z��9���J���Y놅�0,ٙ*e�66�k_b�M�?�G�[7,�d�0\Z/AlB��x{݌HB���1Ζ7�O\Z�rÒ#�����;��{�R�w�!��\"7��i�#\'f��	\ZT����=��WW��$:b��U8���\Z��>�1�g�p��6Z϶��Tr��%Hwɠi[��J��qn��B�\Z�����9w=�>�$,���m�\n�-k�\'�!ϑ��U�Oa��K���x��L?��$36��b�*r�~�Ȯ�	Y�=�|���*�潎Hf<sЌ)�f\\	�RI؝�m\\!���Y��Yy�{9�����!�^?��sVEkE�\n��\"�P��LEz ^H��Ex�GuD��M7�����1��\rҸ�ص��9T[*�-�)�׊9�������3���0���p[r�j�ˀ�̐�7� �~\Zf�5Xz��O�5hv�jW���8��<T�^wM6B�Ղ�\n�U.�dy�u`��g��a�(�N�F�$_���z�Z��\\������{�ﺫ؏���\"���{�pqU���\rU�V�u\nɒ+��p�D�ݘv�P�7��\Z/�Z<���^$ѡJt����o��e��9\0��D\06��l��;ׯ_?\0O��UpWd\'D�d�j��\'��W8�u�B�2��璐Gq���x�9#�u���k����s�.�g�����G~\"g���r�l-L_�`�꓄(�\r�U٪dKx��/�+�UZD�_�Z�׾?籙 �~����Q��\"�&�2�EpQ1��(4���%��A���H��\'���u� Rfɮ���/�w�rɅ�\n�n\ZI�ɾ�\\���{����x�p��:K6���d�V����ѥ%��`�^��՛^9���f�,dˤ��A{�]��\Z��Ǝ�\Z҃Y�Mx8\n2k_�/&Z�E�zo��eG<���~��Y�%g�Ȳ?}�#x\'uI���~|n�m�l��}�\\Z�/sl[V$�ﲌ�5B�ss�Bz��w��i	28e� ��je��*s�vYV؟�fL�,��.${3�)��e��\r�-�x\"�G+�3\'���=s\"�I����g�Y�F�?g���.�x��U<�!Z��G{\Z�.�.�t�}fLm��/�!|;Ǖ4[��¸��,{\'{;RGF��3I���h��Ʒ#4���뙍�;N7���V[\\��\0\0\0\0IEND�B`�'),(3,'A002','DIALLO','IBROSKY','Masculin','620921725','�PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0{\0\0\0s\0\0\0��}\0\0\0sRGB\0���\0\0\0gAMA\0\0���a\0\0\0	pHYs\0\0�\0\0��o�d\0\0�IDATx^�݇�ܶ���_rYr�r�9g[�Q��uX�n�Cq�kIC�v�-��@t_t��s���v�VO�O<q^~���Q�W��\'�|���}�y�E�G�*�F֣�>zNj��В��ٖ�/�O=�Ԅ�1y���Z�F�cH�|�G��!��Ւ_��n���^k�jɮ���~��*�4p��<�N��%	��^�;�a8���[Q_��}���_���ڳ���3��}������?|x衇��z�駧ן{��/�px饗&����\\�q���>�G��xs�瘆��k�*����x`q��+�^����o�}����}���믿>|��w�~����o�~���Ï?�8]���/�~����������ϟ7 �&���hXu�~�����y�o�y���\'�駉�?���������Kq���	\Z�7�|35����\ZY\Z֚0$�\Z��R�Ff��9�}o����/���_��ȟ�9E\rI�w�V�De?��I6�a@e<e�+#���H@F�w���)��=D��>����K}�Uݠ��#ax���ސ���^{m\"���<p.K4$݂�]cC�:�aB�U�0$�1\Z��5dX^��B,����_nݺuN���4������?���S���¨���d;V�T�_f�,�V��ڽJm4�iX���}%����W_����\"{D�1ڋ/�8T�����\0���{���uψ��s\r���?��{���+\"��1���M*ׂ{���ǵ�F�~��zk�1���.dW�M���:��M���H�rǖ�=w/��o�����/3��э��=�nd��Bp�h�\Z<�������?ܼys�zj�p�dȦ(�k+W��ʒ����j\"�!����_ER/H��5N}�yw��FG�������J6d&,���3!���$u��h ��}�Ѥw��?g�c��H��o����`�e�������e��B�x1��{ޭ���l׭4ɼy\nr^��G�ZE]�;�nHF�w�Y�N�$�yvZ;#P�p�ҢU*F�1��Hd�է�+Ї^��klP�K�[��\'i���ati�V��R��>&;o�cK�ـ`�#�z���րk�x9�_��DC7��Wj1L���!�~��=�w0D�m��re\n�,t�C2�Y��d�8EҜW󂭑�����w�$ٲT�M1P�	��I(�/Ϟ�˱ѭ������[�dmXū�ʒ�BvE�%A�Z1��$���������dv٧]�-	}*�\Z�mU��OƳJ��\'熩�-�z�`���W��Ǳ��}D��.��^;�G��삝�e��}D��.��^]�67��!�8;�0�|͂`�N��ֶ�q�6�DW���-��0���	�$�A��=��.d�9�V��xt��f��A#v��1��Of�˜��)�w�yg2��÷@vD:ُf- �W�,�na\\�\r��+��[\n�����/�LOo@��-�ئ#A��F��[���Q��m�ݖD7�m�Go���#}���������g���J�S^�D���rz[מ��1хl��!����V$�F�+�V��lsLt!;�)Q�5��$�9F��\"[-K%![H���M9���s�6�D�0��2��1H��-rCv2r���>=g�c��f�체ے� �V$dz�,#�S�9�]�6�2ehuB���^)G?��1?ޅl�GB�\'� 1�VB8�N$�馌Dz,sv�4��Y%FIruFm�R����^�d���C�����-%gDӍ^��UȜM��n}�E�m�U/Y��:B�d����/��ZӦZ�\'��g+�]��^3Y�u��Y�F4eC�e�<Nz�B/ON��)1��I�z9\ne׮]��GKoɳ�ш�Ct�/\'����\\�{�\ry������G[������섵�v�g�1V��VF�|�h�z�hzЇ��Y��]Ⱦ��d�s�l���ԣ�E9I��5{�jĈ6��s�C�-C�4��9�싢ND���\0}oN$���̛[��h$�3��:w��N��nə�Nv�0\nI<h-d�H�����H�|\"�1d��}lI6ِ�����B�R�x��F`�Hb�Ep%z\'���x��7�f̀T���Z�sk�6fī��>ۨ���I6�O4!�\Z4�D�D��t^-*y m��D��w�b�w�Q�B�E�Ғ�:9��a��	�#ah�y�f�B�H^M�\'\rQ�a�%l�:��a�8���@�<�\"Iҵ�y}Ӣr\ru�	C���-�¢]-	�H�6�\'=���`X���yy~hqa���	��@4T:���C���Oq�\"I;��C������;�WD���r	C*[$1�Ad�	ߩ�c�:\Z�%x�ň��73p��\Z�SZ�-�U��u����!ɾ�Q.�3x�Г0��<���	O�[	�#�J�%C�F�E��A��C�2���u$��lӑ�%����,��N�0V��q���ֻ7VI�}�~BS��,Iv~�#�Dl<ѣz�*�f��c�w��%4���o�W����޽�J��N�9�a	����>Y�Jb���U�\r2�vq$d�Ï)&R4:$�Bz���P=$�9�Q�;Yw�u\\j�y���������V�������Z��9���J���Y놅�0,ٙ*e�66�k_b�M�?�G�[7,�d�0\Z/AlB��x{݌HB���1Ζ7�O\Z�rÒ#�����;��{�R�w�!��\"7��i�#\'f��	\ZT����=��WW��$:b��U8���\Z��>�1�g�p��6Z϶��Tr��%Hwɠi[��J��qn��B�\Z�����9w=�>�$,���m�\n�-k�\'�!ϑ��U�Oa��K���x��L?��$36��b�*r�~�Ȯ�	Y�=�|���*�潎Hf<sЌ)�f\\	�RI؝�m\\!���Y��Yy�{9�����!�^?��sVEkE�\n��\"�P��LEz ^H��Ex�GuD��M7�����1��\rҸ�ص��9T[*�-�)�׊9�������3���0���p[r�j�ˀ�̐�7� �~\Zf�5Xz��O�5hv�jW���8��<T�^wM6B�Ղ�\n�U.�dy�u`��g��a�(�N�F�$_���z�Z��\\������{�ﺫ؏���\"���{�pqU���\rU�V�u\nɒ+��p�D�ݘv�P�7��\Z/�Z<���^$ѡJt����o��e��9\0��D\06��l��;ׯ_?\0O��UpWd\'D�d�j��\'��W8�u�B�2��璐Gq���x�9#�u���k����s�.�g�����G~\"g���r�l-L_�`�꓄(�\r�U٪dKx��/�+�UZD�_�Z�׾?籙 �~����Q��\"�&�2�EpQ1��(4���%��A���H��\'���u� Rfɮ���/�w�rɅ�\n�n\ZI�ɾ�\\���{����x�p��:K6���d�V����ѥ%��`�^��՛^9���f�,dˤ��A{�]��\Z��Ǝ�\Z҃Y�Mx8\n2k_�/&Z�E�zo��eG<���~��Y�%g�Ȳ?}�#x\'uI���~|n�m�l��}�\\Z�/sl[V$�ﲌ�5B�ss�Bz��w��i	28e� ��je��*s�vYV؟�fL�,��.${3�)��e��\r�-�x\"�G+�3\'���=s\"�I����g�Y�F�?g���.�x��U<�!Z��G{\Z�.�.�t�}fLm��/�!|;Ǖ4[��¸��,{\'{;RGF��3I���h��Ʒ#4���뙍�;N7���V[\\��\0\0\0\0IEND�B`�');
/*!40000 ALTER TABLE `apprenants` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cours`
--

DROP TABLE IF EXISTS `cours`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cours` (
  `id_cours` int(11) NOT NULL AUTO_INCREMENT,
  `lib_cours` varchar(30) NOT NULL,
  PRIMARY KEY (`id_cours`),
  UNIQUE KEY `lib_cours` (`lib_cours`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cours`
--

LOCK TABLES `cours` WRITE;
/*!40000 ALTER TABLE `cours` DISABLE KEYS */;
INSERT INTO `cours` VALUES (2,'EXCEL'),(3,'Tap touch'),(5,'thaa'),(1,'WORD');
/*!40000 ALTER TABLE `cours` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facture`
--

DROP TABLE IF EXISTS `facture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `facture` (
  `id_facture` int(11) NOT NULL AUTO_INCREMENT,
  `Montant_Total` int(11) NOT NULL,
  `Montant_Payer` int(11) NOT NULL,
  `Montant_restant` int(11) NOT NULL,
  PRIMARY KEY (`id_facture`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facture`
--

LOCK TABLES `facture` WRITE;
/*!40000 ALTER TABLE `facture` DISABLE KEYS */;
INSERT INTO `facture` VALUES (1,140000,140000,0),(2,120000,50000,70000),(3,140000,140000,0),(4,120000,100000,40000),(5,140000,140000,0);
/*!40000 ALTER TABLE `facture` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fiche_renseign`
--

DROP TABLE IF EXISTS `fiche_renseign`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fiche_renseign` (
  `id_fiche` int(11) NOT NULL AUTO_INCREMENT,
  `id_cours_fiche` int(11) NOT NULL,
  `nbre_jour` varchar(30) NOT NULL,
  `heures_seances` varchar(15) NOT NULL,
  `duree` varchar(15) NOT NULL,
  `id_fraisCours_fiche` int(11) NOT NULL,
  PRIMARY KEY (`id_fiche`),
  UNIQUE KEY `id_cours_fiche` (`id_cours_fiche`),
  KEY `id_fraisCours_fiche` (`id_fraisCours_fiche`),
  CONSTRAINT `fiche_renseign_ibfk_1` FOREIGN KEY (`id_cours_fiche`) REFERENCES `cours` (`id_cours`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fiche_renseign_ibfk_2` FOREIGN KEY (`id_fraisCours_fiche`) REFERENCES `frais_cours` (`id_frais_cours`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fiche_renseign`
--

LOCK TABLES `fiche_renseign` WRITE;
/*!40000 ALTER TABLE `fiche_renseign` DISABLE KEYS */;
INSERT INTO `fiche_renseign` VALUES (1,2,'3','2','3 Semaines',3),(2,1,'5','3','3',1);
/*!40000 ALTER TABLE `fiche_renseign` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `frais_cours`
--

DROP TABLE IF EXISTS `frais_cours`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `frais_cours` (
  `id_frais_cours` int(11) NOT NULL AUTO_INCREMENT,
  `montant_frais_cours` int(11) NOT NULL,
  `id_cours_frais` int(11) NOT NULL,
  PRIMARY KEY (`id_frais_cours`),
  UNIQUE KEY `id_cours_frais` (`id_cours_frais`),
  CONSTRAINT `frais_cours_ibfk_1` FOREIGN KEY (`id_cours_frais`) REFERENCES `cours` (`id_cours`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `frais_cours`
--

LOCK TABLES `frais_cours` WRITE;
/*!40000 ALTER TABLE `frais_cours` DISABLE KEYS */;
INSERT INTO `frais_cours` VALUES (1,120000,1),(2,100000,3),(3,100000,2),(4,1000,5);
/*!40000 ALTER TABLE `frais_cours` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `frais_inscription`
--

DROP TABLE IF EXISTS `frais_inscription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `frais_inscription` (
  `id_frais_inscrip` int(11) NOT NULL AUTO_INCREMENT,
  `montant_frais_inscrip` int(11) NOT NULL,
  `type_inscription` varchar(30) NOT NULL,
  PRIMARY KEY (`id_frais_inscrip`),
  UNIQUE KEY `type_inscrip` (`type_inscription`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `frais_inscription`
--

LOCK TABLES `frais_inscription` WRITE;
/*!40000 ALTER TABLE `frais_inscription` DISABLE KEYS */;
INSERT INTO `frais_inscription` VALUES (1,20000,'INSCRIPTION'),(2,0,'REINSCRIPTION');
/*!40000 ALTER TABLE `frais_inscription` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inscription`
--

DROP TABLE IF EXISTS `inscription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inscription` (
  `id_inscrip` int(11) NOT NULL AUTO_INCREMENT,
  `id_apprenant_inscrip` int(11) NOT NULL,
  `id_cours_inscrip` int(11) NOT NULL,
  `id_frais_cours_inscrip` int(11) NOT NULL,
  `id_fraisInscrip_inscrip` int(11) NOT NULL,
  `type_inscrip` varchar(20) NOT NULL,
  `id_facture_inscrip` int(11) NOT NULL,
  `date_inscrip` varchar(30) NOT NULL,
  PRIMARY KEY (`id_inscrip`),
  KEY `id_apprenant_inscrip` (`id_apprenant_inscrip`),
  KEY `id_cours_inscrip` (`id_cours_inscrip`),
  KEY `id_fraisInscrip_inscrip` (`id_fraisInscrip_inscrip`),
  KEY `id_frais_cours_inscrip` (`id_frais_cours_inscrip`),
  KEY `id_facture_inscrip` (`id_facture_inscrip`),
  CONSTRAINT `inscription_ibfk_1` FOREIGN KEY (`id_apprenant_inscrip`) REFERENCES `apprenants` (`id_apprenant`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `inscription_ibfk_2` FOREIGN KEY (`id_cours_inscrip`) REFERENCES `cours` (`id_cours`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `inscription_ibfk_3` FOREIGN KEY (`id_fraisInscrip_inscrip`) REFERENCES `frais_inscription` (`id_frais_inscrip`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `inscription_ibfk_4` FOREIGN KEY (`id_frais_cours_inscrip`) REFERENCES `frais_cours` (`id_frais_cours`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `inscription_ibfk_5` FOREIGN KEY (`id_facture_inscrip`) REFERENCES `facture` (`id_facture`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inscription`
--

LOCK TABLES `inscription` WRITE;
/*!40000 ALTER TABLE `inscription` DISABLE KEYS */;
INSERT INTO `inscription` VALUES (3,2,1,1,1,'INSCRIPTION',3,'05/10/2023'),(4,2,2,3,1,'INSCRIPTION',4,'05/10/2023'),(5,3,1,1,1,'INSCRIPTION',5,'07/10/2023');
/*!40000 ALTER TABLE `inscription` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  `droit` varchar(15) NOT NULL,
  `etat` varchar(15) NOT NULL,
  PRIMARY KEY (`id_user`),
  UNIQUE KEY `login` (`login`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Thales','root','Admin','Activer'),(2,'Pascal','123','Admin','Activer'),(3,'Bekaye','123','Utilisateur','Activer');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-07  4:32:00
