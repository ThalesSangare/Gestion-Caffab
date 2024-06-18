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
INSERT INTO `apprenants` VALUES (2,'A001','SANG','THAL','Masculin','1122','‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0{\0\0\0s\0\0\0¸”}\0\0\0sRGB\0®Îé\0\0\0gAMA\0\0±üa\0\0\0	pHYs\0\0Ã\0\0ÃÇo¨d\0\0´IDATx^íİ‡’Ü¶Ğıÿ_rYrrÎ9g[ÎQ–ÇuXïnõCqµkIC€vÕ-‚œ@t_t£†söøãvœVOöO<q^~ì±ÇÎQ¯Wäõ\'Ÿ|òŞä}íyÅE×GÇ*ÉFÖ£>zNjóšëĞ’’óÙ–è¼/çO=õÔ„¶1yÿš°ZÏFšcHçˆ|ä‘Gşï½!§’Õ’_‘ïn‘Ïæ^kÃjÉ®Ä—½~êç*Ò4pîı<şNŸ«%	Œ^½;¶a8Ÿ©Ş[Q_ƒú}õ¾¹_½¶¬Ú³‘ùÌ3Ï}öÙéèÚÃ?|xè¡‡ÎÉzúé§§×Ÿ{î¹Ã/¼pxé¥—&¼üòË\\»qãÆô>ŸG´ï€xsîç˜†‘ëkÂ*ÉÑñÜx`qşÊ+¯^ıõÃÛo¿}øğÃŸ}öÙáë¯¿>|÷İw‡~øáğÛo¿~ıõ×Ã?ş8]ûòË/Ÿ~úéôŞ÷ßÿğüóÏŸ7 Ä&”¯•hXu¿~ıúá˜Àyï›o¾yøøã\'úé§‰Ğ?şøãğ÷ßşùçŸKqûöí	\ZÃ7ß|35‘Ñîç¾\ZY\ZÖš0$Ù\Z£òR†Ff®Ó9ç}o¼ñÆá‹/¾˜º_‚ğÈŸş9E\rI¸w÷V×De?²×I6¯a@e<eÄ+#™±ÉH@F„wòâû)¾Ó=Dêƒ>˜úùÔK}ÕUİ öõ#ax²óŞä×^{m\"ùçŸ<p.K4$İ‚ş]cCº:¦aBÊU§0$Ù1\Z‚Á5dX^ÅÃB,ãÿõ×_nİºuNşı–4¦”İëûï¿?¼ûî»S®ºÂ¨ıù°d;V¢Tâ¥_fì,¼V’óÚ½Jm4iX¹æÜ}%¼üÕW_¢ú\"{DÂ‡ã1Ú‹/¾8TøŒÄø•\0¢Œ„{•¹ïuÏˆ†–s\rîóÏ?Ÿ†{ñìì+\"ıƒ1 ¤¨M*×‚{•‹¾Çµ¹F¦~òˆ·ŞzkÊ1æôê.dW¯M¨–Á:º¢MŠ˜ìHè®rÇ–=w/åÛo¿Ææê/3ÑîÊ=¸ndéçBp€h“\Z<¦†ÌÑå÷ß?Ü¼ysêzj®pídÈ¦(¥k+WæåÊ’±¯¾új\"š!º’½„_ER/H”5N}¸ywèFGåèßÚåØèJ6d&,Æàé†3!š„ğ‘$uºëh ¢ş}ôÑ¤w„?g—c£ÙHâ™o§ßÂ`ÈeÀ¹„¨·¨Ëe°àBŸx1ı”{Ş­ÏÙñl×­4É¼y\nr^½‡G‘ZE]Õ;nHFıw¢YôN¾$ºyvZ;#PŞpÅÒ¢U*FÑ1 ãHdÏÕ§­+Ğ‡^ô£klPËK¡[Ÿí¨•\'iÑú¾atiÉV®×R–¬>&;o‡cK¢Ù€`¤#Üz±©ĞÖ€k—x9¡_úìDC7²×Wj1LŒ³©!~†”=Âw0DŸmÉÒre\n×,t¨C2úYÑàdÂ8EÒœWó‚­‘ÏÄåôÕwŸ$Ù²T³M1P°	ÑÑI(§/Ï³Ë±Ñ­Ïá¶óÚ°‚[©dmXÅ«ùÊ’èBvE¶%A«Z1ÊÖ$¡ÜÑ›¬ˆõğî®dvÙ§]™-	}*Ù\ZµmUæÿOÆ³JòÉ\'ç†©Ç-’z™`‘¤™W˜³Ç±±“}DÙÉ.ØÉ^;ÙG”ì‚ìe±“}DÙÉ.ØÉ^]È67œç!Û8;Â0õ|Í‚`ˆNÆÙÖ¶³qÎ6ÇDWÏöÛ-¿ô0á£ä¸	á$¿Aöœ=.d›9‹ÂšVğxtŒ³f‰™A#vœš1ÔÈOfÕËœ¸£)ÃwŞyg2ƒÄÃ·@vD:Ùf- ºW›,na\\¿\r”÷+Š[\nãˆ¾éôË/¿LOo@ôÉ-„Ø¦#A“¥Fâá[ºĞÏQ£Ömé³İ–D7²mÈï›«Goìè“#}õÛöİÍÙæ˜èÖgë«íËJ²S^»D‡èğrz[×³Í1Ñ…l™¸!åãÍÁV$äF¢+ïVÎçlsLt!;“)Q¼5ÄÖ$º9F¿“\"[-K%![HßáµÓM9×ıÂsÎ6ÇD·0®Ï2‰ò1Húğ-rCv2r¢‘Û>=g›c¢Ùfì²´Û’Ä ÁV$dz¥,#÷SŞ9Û]È6ô2ehuB¤¼‰^)G?Úé1?Ş…l³GB¹\'Ç 1ÆVB8‰N$ºé¦ŒDz,svã’4ı–Y%FIruFm­R‰®åü^ûdÈ¡ÜCŞõÛä-%gDÓ^ÊùUÈœMn}¶EŞm’U/Yê¼:B§dáÈÅÌ/ğê“ZÓ¦Z¹\'ùÇg+Ş]½š^3Y¸uü“YÏF4eCºeÎ<Nz‹B/ON²¼)1¥ûI­z9\ne×®]›GKoÉ³ãÑˆÎCtò/\'åÙñî\\Ó{ƒ\ryúğµ¢³ÁG[ÒíáÍİûì„µ´vºg‡1Vú»VFñ|õhë’zóhzĞ‡ÑY¹é]È¾úğdæsÆl¯õÔ£ÖE9I™ñ´5{ÄjÄˆ6©çsºC’-C÷4ãî9ì‹¢NDıı»\0}oN$ÛÉşÌ›[ïÍh$3‚ˆ:wª‹N„nÉ™ãNvÆ0\nI<h-d‹Hï½÷ŞäÍH•|\"Û1dÏé}lI6ÙçáòíêBç’RÃx­“F`’HbïEp%z\'»€‘x‚±7ïfÌ€Tãö’ZskÕ6fÄ«‘œ>Û¨Ãõ„I6ğO4!Ñ\Z4ÇD½DŸ„t^-*y mô¨DËÈw²bÓwçQ—BçEúÒ’—:9·Ğa¦Á	á#ah²yf¡BòH^MÔ\'\rQa¸%l·:€aÃ8Ïö„@á<Ï\"IÒµ€y}Ó¢r\ruî•„İ	C’¾-çÂ¢]-	ç£HÈ6à\'=ˆ‘ä`X²ë÷yy~hqaÂãÑ	ßõ@4T:ÌéÖC’®OqÌ\"I;³ÖC’…›¾…î­î;ÙWDú¼„r	C*[$1–Adß	ß©·cê:\Z†%xÃÅˆÎÍ73p’µ\ZÒSZ-îU÷·u®úŒ‚!É¾Q.”3xÍĞ“0™²<¶¸ı	O†[	á#¾J²%C™FíE¶‘AşóC2ïİÖu$¬’lÓ‘¦%‘½Ä,›¿N–0V²…q„çØÖ»7VI¶}×~BS½š,Iv~Â#‰Dl<Ñ£zù*ÉfÌüc‰w‡ü%4ëÕê¡oW«’ƒ¶Ş½±J²ÒNÔ9²a	²³Œ©>YÙJb´õîU’\r2òvq$dÇÃ)&R4:$çBz°“ıP=$à9¦Q•;YwÈu\\jÏyı÷½ôÑê¥îñğV§Ş’ìë˜şòZúì9²—šJë³ÕYë†…‘0,Ù™*e´66ë“k_bŒMÜ?»G‘[7,ìdÿ0\Z/AlB¤óx{İŒHB¶ãÉ1Î–7¨O\Z¤rÃ’#‚²¾š·;—‰{ÒRÂwÙ!şØ\"7È²i„#\'fÁ°	\ZT²Áê¢=‹…WW²—$:b÷ŒU8õÒë\Züœ>½1´gÇpÀ 6ZÏ¶TrŸó%HwÉ i[¿éJŸ­qnìBÙ\ZÖÒÏÖ÷9w=ç>“$,œm‡\n’-kê\'­!Ï‘¹ÁUÜOa¬¯KØÇòxéèL?ºÕ$36‰Íb×*rı~á®È®•	Yõ=ƒ|’É*»æ½Hf<sĞŒ)Ëf\\	ØRIØ¤m\\!İ€–Y™«Yyì{9ºäõŠÖ!ò¹¼^?ÜÙsVEkEÛ\n×Ï\"ÛP†‘LEz ^H®†Exí«GuD¸ÄM7£şöË1é›\rÒ¸ƒØµÚÔ9T[*ß-î)Œ×Š9§†Ğöı¥3æı†0¼Áşp[r…jŞË€ Ì­7 µ~\Zfâ5XzÑÏO‘5hvŠjW×ë¼Ú8¯û<T»^wM6B¥Õ‚²\nÎU.ï•dy¯u`Şëg¹úaÃ(ÉN®F„$_Áz’Z¯Š\\§ıÏãõï¦{õïº«ØØë\"’Ù×{‚pqUÜÙí\rU¦VĞu\nÉ’+áÌpÉDˆİ˜v™P7Ì×\Z/âZ<¨·¤^$Ñ¡Jt¢ıÙÁoÙìeÓğ9\0ï×D\06äÁlêÁ;×¯_?\0OËÉUpWd\'D‡däj¡ú\'Ã­W8¶u‡BÂ2‚ªç’Gq¯ßÉx‘9#öu«‡k—½–×sÎ.ôg¶ö“ì¥ßG~\"gìŞòrîŠl-L_ƒ`äê“„(•\r¡UÙªdKx•¼/Š+¯UZD¢_¢ZŞ×¾?ç±™ ğ~ßÈÖQæœç\"¼&¡2îEpQ1•º(4ïòß%„ÏAÄäñHğÁ\'¯ÏşuĞ RfÉ®‰€²/ÔwørÉ…„\n©n\ZIÜÉ¾Ò\\ÁÎú{óúù„xÇpÖò:K6’µ’dˆV™¶øÂÑ¥%¸á`’^ëûÕ›^9…ÉöfŞ,dË¤õ¹A{Ã]úˆ\ZŒé³ÆÃ\ZÒƒY²Mx8\n2k_”/&ZÓE¡zoË‡eG<Éàë~öŠY²%gÆÈ²?}™#x\'uI®”²~|n†m–l±¿}è\\Z/sl[V$¯ï²Œ°5B¶ssóBzËëw—ˆi	28e¡ ¿¥jeì*s×vYVØŸ£fL,ıÁ.${3½)ãŞeİÂ\r‘-ãx\"›G+˜3\'«ŸŞ=s\"´I™éäİg†YˆFº?g©ıô.ë–x·åU<Ÿ!ZøßG{\ZÑ.÷.¢t‡}fLmâÄ/ì!|;Ç•4[¬šÂ¸¸,{\'{;RGF’î3I™¸hıõÆ·#4ÓÜÇë™î;N7ÿÒúV[\\òÌ\0\0\0\0IEND®B`‚'),(3,'A002','DIALLO','IBROSKY','Masculin','620921725','‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0{\0\0\0s\0\0\0¸”}\0\0\0sRGB\0®Îé\0\0\0gAMA\0\0±üa\0\0\0	pHYs\0\0Ã\0\0ÃÇo¨d\0\0´IDATx^íİ‡’Ü¶Ğıÿ_rYrrÎ9g[ÎQ–ÇuXïnõCqµkIC€vÕ-‚œ@t_t£†söøãvœVOöO<q^~ì±ÇÎQ¯Wäõ\'Ÿ|òŞä}íyÅE×GÇ*ÉFÖ£>zNjóšëĞ’’óÙ–è¼/çO=õÔ„¶1yÿš°ZÏFšcHçˆ|ä‘Gşï½!§’Õ’_‘ïn‘Ïæ^kÃjÉ®Ä—½~êç*Ò4pîı<şNŸ«%	Œ^½;¶a8Ÿ©Ş[Q_ƒú}õ¾¹_½¶¬Ú³‘ùÌ3Ï}öÙéèÚÃ?|xè¡‡ÎÉzúé§§×Ÿ{î¹Ã/¼pxé¥—&¼üòË\\»qãÆô>ŸG´ï€xsîç˜†‘ëkÂ*ÉÑñÜx`qşÊ+¯^ıõÃÛo¿}øğÃŸ}öÙáë¯¿>|÷İw‡~øáğÛo¿~ıõ×Ã?ş8]ûòË/Ÿ~úéôŞ÷ßÿğüóÏŸ7 Ä&”¯•hXu¿~ıúá˜Àyï›o¾yøøã\'úé§‰Ğ?şøãğ÷ßşùçŸKqûöí	\ZÃ7ß|35‘Ñîç¾\ZY\ZÖš0$Ù\Z£òR†Ff®Ó9ç}o¼ñÆá‹/¾˜º_‚ğÈŸş9E\rI¸w÷V×De?²×I6¯a@e<eÄ+#™±ÉH@F„wòâû)¾Ó=Dêƒ>˜úùÔK}ÕUİ öõ#ax²óŞä×^{m\"ùçŸ<p.K4$İ‚ş]cCº:¦aBÊU§0$Ù1\Z‚Á5dX^ÅÃB,ãÿõ×_nİºuNşı–4¦”İëûï¿?¼ûî»S®ºÂ¨ıù°d;V¢Tâ¥_fì,¼V’óÚ½Jm4iX¹æÜ}%¼üÕW_¢ú\"{DÂ‡ã1Ú‹/¾8TøŒÄø•\0¢Œ„{•¹ïuÏˆ†–s\rîóÏ?Ÿ†{ñìì+\"ıƒ1 ¤¨M*×‚{•‹¾Çµ¹F¦~òˆ·ŞzkÊ1æôê.dW¯M¨–Á:º¢MŠ˜ìHè®rÇ–=w/åÛo¿Ææê/3ÑîÊ=¸ndéçBp€h“\Z<¦†ÌÑå÷ß?Ü¼ysêzj®pídÈ¦(¥k+WæåÊ’±¯¾új\"š!º’½„_ER/H”5N}¸ywèFGåèßÚåØèJ6d&,Æàé†3!š„ğ‘$uºëh ¢ş}ôÑ¤w„?g—c£ÙHâ™o§ßÂ`ÈeÀ¹„¨·¨Ëe°àBŸx1ı”{Ş­ÏÙñl×­4É¼y\nr^½‡G‘ZE]Õ;nHFıw¢YôN¾$ºyvZ;#PŞpÅÒ¢U*FÑ1 ãHdÏÕ§­+Ğ‡^ô£klPËK¡[Ÿí¨•\'iÑú¾atiÉV®×R–¬>&;o‡cK¢Ù€`¤#Üz±©ĞÖ€k—x9¡_úìDC7²×Wj1LŒ³©!~†”=Âw0DŸmÉÒre\n×,t¨C2úYÑàdÂ8EÒœWó‚­‘ÏÄåôÕwŸ$Ù²T³M1P°	ÑÑI(§/Ï³Ë±Ñ­Ïá¶óÚ°‚[©dmXÅ«ùÊ’èBvE¶%A«Z1ÊÖ$¡ÜÑ›¬ˆõğî®dvÙ§]™-	}*Ù\ZµmUæÿOÆ³JòÉ\'ç†©Ç-’z™`‘¤™W˜³Ç±±“}DÙÉ.ØÉ^;ÙG”ì‚ìe±“}DÙÉ.ØÉ^]È67œç!Û8;Â0õ|Í‚`ˆNÆÙÖ¶³qÎ6ÇDWÏöÛ-¿ô0á£ä¸	á$¿Aöœ=.d›9‹ÂšVğxtŒ³f‰™A#vœš1ÔÈOfÕËœ¸£)ÃwŞyg2ƒÄÃ·@vD:Ùf- ºW›,na\\¿\r”÷+Š[\nãˆ¾éôË/¿LOo@ôÉ-„Ø¦#A“¥Fâá[ºĞÏQ£Ömé³İ–D7²mÈï›«Goìè“#}õÛöİÍÙæ˜èÖgë«íËJ²S^»D‡èğrz[×³Í1Ñ…l™¸!åãÍÁV$äF¢+ïVÎçlsLt!;“)Q¼5ÄÖ$º9F¿“\"[-K%![HßáµÓM9×ıÂsÎ6ÇD·0®Ï2‰ò1Húğ-rCv2r¢‘Û>=g›c¢Ùfì²´Û’Ä ÁV$dz¥,#÷SŞ9Û]È6ô2ehuB¤¼‰^)G?Úé1?Ş…l³GB¹\'Ç 1ÆVB8‰N$ºé¦ŒDz,svã’4ı–Y%FIruFm­R‰®åü^ûdÈ¡ÜCŞõÛä-%gDÓ^ÊùUÈœMn}¶EŞm’U/Yê¼:B§dáÈÅÌ/ğê“ZÓ¦Z¹\'ùÇg+Ş]½š^3Y¸uü“YÏF4eCºeÎ<Nz‹B/ON²¼)1¥ûI­z9\ne×®]›GKoÉ³ãÑˆÎCtò/\'åÙñî\\Ó{ƒ\ryúğµ¢³ÁG[ÒíáÍİûì„µ´vºg‡1Vú»VFñ|õhë’zóhzĞ‡ÑY¹é]È¾úğdæsÆl¯õÔ£ÖE9I™ñ´5{ÄjÄˆ6©çsºC’-C÷4ãî9ì‹¢NDıı»\0}oN$ÛÉşÌ›[ïÍh$3‚ˆ:wª‹N„nÉ™ãNvÆ0\nI<h-d‹Hï½÷ŞäÍH•|\"Û1dÏé}lI6ÙçáòíêBç’RÃx­“F`’HbïEp%z\'»€‘x‚±7ïfÌ€Tãö’ZskÕ6fÄ«‘œ>Û¨Ãõ„I6ğO4!Ñ\Z4ÇD½DŸ„t^-*y mô¨DËÈw²bÓwçQ—BçEúÒ’—:9·Ğa¦Á	á#ah²yf¡BòH^MÔ\'\rQa¸%l·:€aÃ8Ïö„@á<Ï\"IÒµ€y}Ó¢r\ruî•„İ	C’¾-çÂ¢]-	ç£HÈ6à\'=ˆ‘ä`X²ë÷yy~hqaÂãÑ	ßõ@4T:ÌéÖC’®OqÌ\"I;³ÖC’…›¾…î­î;ÙWDú¼„r	C*[$1–Adß	ß©·cê:\Z†%xÃÅˆÎÍ73p’µ\ZÒSZ-îU÷·u®úŒ‚!É¾Q.”3xÍĞ“0™²<¶¸ı	O†[	á#¾J²%C™FíE¶‘AşóC2ïİÖu$¬’lÓ‘¦%‘½Ä,›¿N–0V²…q„çØÖ»7VI¶}×~BS½š,Iv~Â#‰Dl<Ñ£zù*ÉfÌüc‰w‡ü%4ëÕê¡oW«’ƒ¶Ş½±J²ÒNÔ9²a	²³Œ©>YÙJb´õîU’\r2òvq$dÇÃ)&R4:$çBz°“ıP=$à9¦Q•;YwÈu\\jÏyı÷½ôÑê¥îñğV§Ş’ìë˜şòZúì9²—šJë³ÕYë†…‘0,Ù™*e´66ë“k_bŒMÜ?»G‘[7,ìdÿ0\Z/AlB¤óx{İŒHB¶ãÉ1Î–7¨O\Z¤rÃ’#‚²¾š·;—‰{ÒRÂwÙ!şØ\"7È²i„#\'fÁ°	\ZT²Áê¢=‹…WW²—$:b÷ŒU8õÒë\Züœ>½1´gÇpÀ 6ZÏ¶TrŸó%HwÉ i[¿éJŸ­qnìBÙ\ZÖÒÏÖ÷9w=ç>“$,œm‡\n’-kê\'­!Ï‘¹ÁUÜOa¬¯KØÇòxéèL?ºÕ$36‰Íb×*rı~á®È®•	Yõ=ƒ|’É*»æ½Hf<sĞŒ)Ëf\\	ØRIØ¤m\\!İ€–Y™«Yyì{9ºäõŠÖ!ò¹¼^?ÜÙsVEkEÛ\n×Ï\"ÛP†‘LEz ^H®†Exí«GuD¸ÄM7£şöË1é›\rÒ¸ƒØµÚÔ9T[*ß-î)Œ×Š9§†Ğöı¥3æı†0¼Áşp[r…jŞË€ Ì­7 µ~\Zfâ5XzÑÏO‘5hvŠjW×ë¼Ú8¯û<T»^wM6B¥Õ‚²\nÎU.ï•dy¯u`Şëg¹úaÃ(ÉN®F„$_Áz’Z¯Š\\§ıÏãõï¦{õïº«ØØë\"’Ù×{‚pqUÜÙí\rU¦VĞu\nÉ’+áÌpÉDˆİ˜v™P7Ì×\Z/âZ<¨·¤^$Ñ¡Jt¢ıÙÁoÙìeÓğ9\0ï×D\06äÁlêÁ;×¯_?\0OËÉUpWd\'D‡däj¡ú\'Ã­W8¶u‡BÂ2‚ªç’Gq¯ßÉx‘9#öu«‡k—½–×sÎ.ôg¶ö“ì¥ßG~\"gìŞòrîŠl-L_ƒ`äê“„(•\r¡UÙªdKx•¼/Š+¯UZD¢_¢ZŞ×¾?ç±™ ğ~ßÈÖQæœç\"¼&¡2îEpQ1•º(4ïòß%„ÏAÄäñHğÁ\'¯ÏşuĞ RfÉ®‰€²/ÔwørÉ…„\n©n\ZIÜÉ¾Ò\\ÁÎú{óúù„xÇpÖò:K6’µ’dˆV™¶øÂÑ¥%¸á`’^ëûÕ›^9…ÉöfŞ,dË¤õ¹A{Ã]úˆ\ZŒé³ÆÃ\ZÒƒY²Mx8\n2k_”/&ZÓE¡zoË‡eG<Éàë~öŠY²%gÆÈ²?}™#x\'uI®”²~|n†m–l±¿}è\\Z/sl[V$¯ï²Œ°5B¶ssóBzËëw—ˆi	28e¡ ¿¥jeì*s×vYVØŸ£fL,ıÁ.${3½)ãŞeİÂ\r‘-ãx\"›G+˜3\'«ŸŞ=s\"´I™éäİg†YˆFº?g©ıô.ë–x·åU<Ÿ!ZøßG{\ZÑ.÷.¢t‡}fLmâÄ/ì!|;Ç•4[¬šÂ¸¸,{\'{;RGF’î3I™¸hıõÆ·#4ÓÜÇë™î;N7ÿÒúV[\\òÌ\0\0\0\0IEND®B`‚');
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
