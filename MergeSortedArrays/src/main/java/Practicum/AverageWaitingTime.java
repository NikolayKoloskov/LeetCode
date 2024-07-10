package Practicum;

import java.util.ArrayList;

/**
 * 1701. Average Waiting Time MEDIUM https://leetcode.com/problems/average-waiting-time/description/
 */
public class AverageWaitingTime {
    public double averageWaitingTime(int[][] customers) {
        long startTimeOfCooking = 0;
        long endTime = 0;
        ArrayList<Integer> waitingTime = new ArrayList<>();
        double totalTime = 0;
        for (int i = 0; i < customers.length; i++) {
            for (int j = 0; j < customers[i].length -1; j++) {
                if (endTime < customers[i][0]) {
                    startTimeOfCooking = customers[i][0];
                    endTime = startTimeOfCooking + customers[i][1];
                    totalTime += endTime - customers[i][0];
                }else {
                    startTimeOfCooking = endTime;
                    endTime = startTimeOfCooking + customers[i][1];
                    totalTime += endTime - customers[i][0];
                }
            }
        }
        return totalTime / customers.length;
    }

    public static void main(String[] args) {
        AverageWaitingTime averageWaitingTime = new AverageWaitingTime();
        int[][] customers = {{1,496},{2,8112},{6,1395},{7,7068},{7,9388},{8,905},{8,8590},{8,5521},{8,6158},{10,8466},{11,2337},{12,1220},{12,3716},{13,7951},{14,6366},{14,4162},{14,7002},{15,2950},{17,6518},{17,7449},{18,4937},{19,1821},{20,8373},{22,1358},{23,4917},{24,9426},{26,2589},{27,7284},{30,7260},{30,6943},{31,4695},{32,7456},{32,3251},{33,278},{34,9565},{35,473},{36,4857},{37,7986},{37,2035},{38,1502},{38,4237},{41,4175},{42,7837},{42,5949},{43,4614},{46,3962},{46,3226},{48,2093},{49,1049},{50,2192},{51,3349},{52,4579},{53,4406},{53,9947},{57,7838},{58,214},{61,8615},{62,5541},{63,8839},{63,3873},{64,1655},{64,2849},{64,1208},{65,1205},{65,5235},{66,196},{66,7359},{67,7971},{68,1018},{68,8263},{69,1880},{70,8755},{71,8382},{74,6371},{74,9326},{75,8945},{77,2827},{77,4006},{77,1425},{79,5272},{80,8213},{81,2},{81,7784},{83,5064},{84,3824},{84,275},{85,1066},{86,4072},{87,804},{89,4134},{89,2180},{90,4863},{91,5574},{91,392},{91,6700},{91,8220},{92,8623},{92,7956},{93,9683},{93,1060},{93,3749},{94,5498},{94,6493},{94,8234},{96,2028},{96,6512},{97,5006},{98,9340},{99,9640},{99,9354},{101,6443},{102,8702},{102,9630},{103,6176},{103,2541},{104,8846},{104,6027},{106,9286},{107,9531},{108,1007},{109,309},{109,6117},{109,7233},{112,395},{115,2995},{116,8367},{117,9077},{120,3897},{120,8604},{122,9613},{123,7676},{125,7897},{125,1876},{125,6479},{126,3836},{129,8801},{130,6410},{131,3679},{134,452},{136,7454},{137,9368},{138,3305},{140,9762},{140,8262},{141,988},{141,7852},{142,9251},{143,4949},{144,1640},{145,4385},{145,1894},{147,7857},{147,8301},{148,9743},{149,6485},{150,9100},{150,4983},{151,7875},{154,4518},{155,5516},{156,786},{156,8088},{157,9369},{157,4459},{157,8724},{159,7302},{160,7511},{160,6411},{161,3073},{162,261},{162,8873},{164,1538},{165,9054},{165,6971},{165,1801},{166,7530},{168,6444},{169,8578},{170,7351},{170,6568},{171,3486},{172,6311},{172,5075},{175,185},{179,9515},{179,3739},{179,4150},{179,8873},{180,7217},{181,9702},{181,2190},{183,3836},{184,1535},{185,1761},{186,5542},{188,1805},{189,9289},{191,8112},{193,8408},{195,7429},{195,5883},{202,7525},{203,8710},{204,8640},{205,6844},{206,4960},{207,1722},{208,844},{208,2522},{208,999},{209,4926},{211,747},{212,3129},{216,7271},{217,8376},{219,2049},{219,1998},{219,2293},{221,841},{222,6713},{222,2799},{223,6219},{225,3633},{226,3580},{227,2430},{228,2837},{229,4049},{231,72},{231,8881},{232,6665},{232,3029},{233,9015},{234,362},{235,8739},{235,3320},{236,7787},{236,3586},{237,8797},{237,4379},{238,7819},{239,8805},{239,3219},{240,6393},{240,178},{245,6698},{246,3899},{246,8133},{249,1306},{249,3885},{252,8358},{252,5477},{254,8120},{255,9298},{255,7478},{255,836},{258,4596},{258,3419},{259,7743},{260,5227},{261,3514},{261,4281},{262,2505},{267,6141},{271,3688},{274,8312},{275,1837},{277,9659},{278,9800},{281,5559},{281,7667},{281,3144},{281,3243},{282,8266},{283,1095},{283,4424},{283,3953},{284,9794},{284,120},{286,4281},{287,960},{288,5861},{288,2106},{290,2670},{291,4063},{296,5385},{299,7389},{300,3828},{300,5148},{305,3270},{309,3698},{311,4720},{312,4843},{313,9114},{314,918},{317,2437},{319,466},{321,1269},{322,4347},{322,1925},{322,3664},{323,1872},{323,422},{324,905},{324,6986},{324,8122},{324,2803},{326,5796},{328,1466},{329,9456},{329,4949},{329,939},{330,6618},{330,1935},{331,5697},{331,2033},{335,7331},{335,434},{337,4629},{337,6809},{338,554},{338,8919},{338,4881},{340,9452},{341,9489},{341,7920},{342,9193},{343,2277},{345,7183},{345,8415},{346,4566},{348,7294},{350,6243},{351,9454},{351,5642},{351,997},{352,5930},{352,9105},{352,6200},{354,2569},{354,8321},{355,3865},{357,5563},{357,5645},{358,932},{359,1549},{360,9251},{360,3737},{363,9182},{363,7334},{364,4874},{364,6795},{365,7788},{366,2273},{367,6471},{369,7795},{371,989},{371,2309},{372,6520},{372,5531},{375,119},{375,5426},{378,6729},{379,4776},{379,4869},{379,9924},{381,722},{382,1317},{383,6859},{383,2151},{387,2989},{388,8048},{388,8184},{390,8256},{391,4228},{393,4558},{394,8624},{397,5108},{398,2783},{400,8747},{401,2184},{402,6075},{403,6251},{403,7987},{404,4260},{407,5780},{407,4400},{408,9897},{408,8258},{409,7089},{409,298},{411,8982},{411,306},{411,5172},{413,7190},{413,9558},{414,7530},{415,3141},{416,7787},{416,4327},{417,5837},{421,9299},{422,3395},{424,4581},{424,2851},{424,4755},{425,9690},{427,6239},{428,2728},{429,7921},{430,589},{431,5015},{431,4919},{434,2985},{435,7788},{437,9663},{438,4543},{439,3385},{440,8679},{441,1967},{442,53},{445,6370},{445,8397},{445,7163},{446,1484},{452,3121},{452,4511},{454,5380},{454,9712},{461,8035},{462,9980},{463,4381},{463,2315},{464,7565},{465,6108},{466,7769},{466,3199},{467,1429},{467,2435},{467,7152},{469,5694},{469,7253},{469,9143},{470,1793},{474,6949},{475,397},{475,2501},{475,3675},{478,9059},{480,327},{480,4064},{481,103},{483,2900},{484,7847},{484,4905},{486,6072},{493,114},{494,7799},{495,9926},{497,3164},{499,183},{499,4452},{500,8143},{502,1329},{502,374},{505,6511},{505,1244},{505,4909},{505,4852},{505,6073},{506,4492},{506,1041},{507,6022},{508,1449},{508,6168},{511,1720},{512,5201},{512,4838},{513,5587},{514,4256},{515,5353},{516,9463},{517,7787},{519,7021},{519,3938},{520,502},{520,5384},{520,7629},{520,1472},{521,7156},{521,7755},{521,235},{522,2859},{522,2471},{523,391},{525,5638},{527,6855},{527,2943},{529,9093},{530,8615},{531,6848},{532,3082},{533,2601},{534,3496},{534,2423},{535,1873},{535,6917},{535,3162},{535,6617},{535,2448},{536,9969},{539,7485},{539,7261},{541,356},{543,3287},{543,2760},{545,1439},{545,2053},{546,9072},{547,9608},{548,3361},{549,37},{550,3185},{550,4058},{551,1729},{553,5299},{554,2184},{554,9127},{554,6008},{556,9769},{556,7030},{556,465},{558,9479},{558,6135},{558,1561},{560,3736},{561,8632},{562,4048},{563,5672},{564,1384},{565,6902},{566,3231},{566,3539},{567,5511},{568,1113},{568,2891},{570,6675},{570,1911},{572,9367},{573,5402},{573,3261},{573,8631},{573,9193},{574,3363},{575,3431},{577,7908},{577,543},{578,3610},{578,3810},{578,2270},{581,1964},{582,5028},{582,3312},{583,9408},{584,3949},{584,6018},{584,4399},{584,9065},{585,4456},{586,1101},{586,9476},{587,1408},{587,9459},{587,8384},{589,9266},{591,5616},{591,3999},{592,5566},{593,5206},{596,9340},{597,9061},{598,2492},{598,6995},{602,4896},{602,4761},{602,25},{602,1007},{605,1182},{606,9403},{607,8120},{608,8986},{608,147},{609,8264},{611,4150},{611,8411},{616,6379},{618,5070},{619,7050},{621,7617},{621,7012},{623,5984},{624,3653},{624,8197},{625,8046},{627,3483},{627,6305},{629,8694},{631,6127},{631,3242},{632,6389},{632,3681},{634,4917},{634,2202},{635,6280},{637,4679},{639,858},{639,2862},{639,1622},{639,3556},{642,1131},{643,4672},{645,1558},{648,7399},{648,9378},{649,9725},{650,2647},{651,7479},{652,7876},{652,1319},{652,9831},{653,2378},{654,5575},{656,203},{657,6449},{657,9012},{659,7631},{659,8815},{659,542},{661,4100},{664,875},{664,6333},{666,6812},{667,1574},{668,2306},{672,1872},{672,4787},{673,3243},{673,4585},{676,5047},{676,7723},{676,9447},{677,9392},{678,1887},{681,8060},{682,9404},{684,1587},{685,6485},{687,7701},{688,5445},{689,4837},{691,4426},{692,7128},{692,2113},{692,7559},{694,4866},{695,1439},{696,3323},{697,5874},{697,3240},{698,9578},{698,4789},{698,1580},{699,4957},{700,9206},{700,3043},{701,6980},{701,2553},{703,1474},{703,9522},{704,8486},{704,9691},{707,3100},{708,1071},{708,3999},{708,5807},{709,3161},{709,1845},{710,6965},{713,2456},{713,6110},{714,9103},{716,449},{716,5833},{716,70},{719,220},{720,5469},{721,4969},{721,656},{722,866},{725,3198},{725,7033},{727,6907},{727,9152},{728,9834},{728,6865},{729,3765},{731,430},{733,9078},{734,2794},{734,815},{734,3995},{735,8618},{735,7169},{736,8824},{737,727},{741,1271},{742,901},{742,1161},{743,9057},{744,9106},{745,5223},{745,8317},{748,9443},{748,6402},{748,2653},{748,4088},{749,776},{752,2104},{755,8188},{757,9800},{758,1168},{758,7540},{759,7835},{761,1502},{765,2290},{767,1167},{767,1489},{767,5190},{767,1190},{767,2794},{767,5411},{767,7625},{769,9828},{769,5925},{770,8267},{770,4973},{771,1842},{771,7032},{774,9249},{777,1235},{778,5962},{779,8411},{780,403},{780,7420},{781,5927},{783,5982},{785,1054},{785,6940},{785,5541},{786,1976},{788,6278},{789,1617},{790,9444},{790,5564},{791,3217},{792,1518},{794,5248},{795,4525},{796,877},{798,271},{798,7640},{799,9117},{802,2327},{804,454},{804,3014},{804,1347},{805,5256},{807,4504},{807,4993},{809,2966},{809,8217},{810,8080},{812,7416},{813,5857},{813,8142},{814,472},{814,1229},{814,495},{815,1968},{817,4052},{818,7165},{819,2680},{819,4384},{820,7984},{824,3224},{825,6349},{825,6447},{826,7701},{826,9628},{826,7425},{827,6484},{828,68},{829,4256},{829,1754},{829,9161},{831,9431},{832,3303},{833,6897},{834,2911},{836,3063},{837,6063},{838,4732},{841,8182},{843,974},{844,6745},{844,9910},{845,6537},{846,2947},{847,4619},{848,183},{848,6179},{849,8102},{850,7478},{852,4061},{852,223},{852,7943},{853,4956},{856,8712},{856,6100},{863,5377},{864,4530},{865,8167},{865,2383},{866,1930},{866,8636},{869,4715},{870,5609},{873,6365},{874,4136},{874,8058},{879,7228},{883,5652},{885,8213},{885,3049},{887,4987},{887,787},{889,3492},{889,4769},{891,3514},{892,2773},{897,2850},{898,9720},{898,3666},{898,436},{899,420},{899,6460},{900,8402},{900,5617},{904,193},{905,2312},{905,7055},{907,3130},{908,6726},{910,6229},{913,4392},{913,4028},{913,3437},{917,8976},{917,9978},{918,9556},{919,7504},{919,8341},{922,9686},{924,1895},{925,6876},{926,8416},{928,3105},{930,3881},{930,4277},{931,6094},{933,4311},{934,4577},{935,2858},{935,8396},{938,1933},{938,2451},{939,7373},{940,8815},{942,1438},{944,5010},{944,8984},{944,7848},{945,3816},{947,5292},{950,1015},{951,2431},{952,8398},{953,8009},{954,1565},{956,4572},{957,6813},{958,9045},{959,570},{961,2298},{962,8264},{962,7488},{962,8588},{964,3865},{964,1075},{965,6579},{965,7603},{967,5299},{967,7511},{969,9269},{973,7483},{973,9657},{975,7797},{976,4786},{976,9611},{977,2621},{977,7176},{978,2608},{979,1393},{980,4109},{980,4139},{981,6877},{983,1202},{983,1926},{986,5578},{986,5277},{990,2998},{992,3454},{992,3348},{993,6039},{994,5493},{994,2273},{996,5718},{997,1910},{998,7846},{999,7377},{999,5808},{1004,3454},{1005,7272},{1006,2684},{1006,8034},{1006,537},{1007,2976},{1008,6218},{1008,9241},{1011,9017},{1011,8004},{1012,3407},{1013,4368},{1015,7884},{1016,842},{1016,4736},{1017,8400},{1018,2569},{1018,2328},{1018,5426},{1019,4543},{1020,643},{1020,712},{1020,7700},{1021,5636},{1023,625},{1023,8648},{1024,7183},{1028,9144},{1028,5039},{1031,2599},{1032,416},{1034,5365},{1035,5824},{1035,3049},{1037,3949},{1038,2028},{1038,886},{1038,5568},{1039,7964},{1040,1186},{1041,689},{1046,8508},{1046,1790},{1046,4017},{1052,3754},{1053,3419},{1054,3116},{1055,1956},{1056,585},{1057,7639},{1058,8408},{1059,4303},{1059,3762},{1060,1185},{1060,4849},{1061,7755},{1061,3104},{1061,7414},{1062,6501},{1062,5870},{1062,8203},{1063,7670},{1065,2086},{1065,7364},{1066,3671},{1066,5867},{1068,7305},{1068,7223},{1069,4033},{1070,6886},{1071,2575},{1072,8070},{1072,8064},{1074,7637},{1074,9171},{1074,7910},{1075,7921},{1076,9171},{1077,9397},{1079,5132},{1082,1195},{1082,177},{1083,857},{1085,2647},{1088,9954},{1092,2028},{1093,2746},{1094,3710},{1094,1205},{1094,7107},{1100,1642},{1102,7162},{1103,2863},{1103,7158},{1105,3196},{1108,8511},{1114,4720},{1115,253},{1118,5023},{1118,1356},{1119,8023},{1119,7723},{1119,7699},{1120,9685},{1121,4546},{1121,5636},{1122,9026},{1123,9900},{1125,7039},{1126,3480},{1127,9528},{1128,9835},{1132,8480},{1132,5761},{1133,5661},{1133,2056},{1133,5838},{1134,4262},{1136,1696},{1138,3301},{1139,2004},{1140,6582},{1141,8874},{1142,2936},{1142,3278},{1143,9340},{1144,9413},{1144,479},{1147,9471},{1147,5599},{1148,8674},{1152,4121},{1153,5850},{1154,6588},{1154,5024},{1155,5332},{1156,4260},{1157,3682},{1157,3647},{1158,6792},{1160,4536},{1162,5830},{1164,885},{1165,1566},{1165,3003},{1166,5666},{1168,5111},{1168,5053},{1169,5579},{1170,9804},{1170,8680},{1173,7960},{1173,3411},{1174,6821},{1174,4885},{1177,7361},{1179,1593},{1181,8327},{1183,9838},{1185,8982},{1185,4478},{1186,1237},{1186,4799},{1187,902},{1187,9084},{1187,6486},{1189,6154},{1191,2321},{1192,5791},{1192,435},{1194,7901},{1195,6486},{1197,1702},{1198,1749},{1198,2815},{1199,1276},{1199,7702},{1199,517},{1200,8585},{1201,8116},{1202,7097},{1204,645},{1204,9362},{1204,4823},{1205,382},{1206,1859},{1207,9468},{1208,529},{1209,3941},{1209,2773},{1211,4690},{1211,5064},{1212,325},{1212,3968},{1213,2523},{1214,3144},{1215,8916},{1215,6973},{1216,7457},{1218,3615},{1219,9403},{1219,4292},{1220,9783},{1222,7581},{1224,1743},{1225,1247},{1227,9802},{1227,5444},{1229,2243},{1232,2564},{1234,9042},{1234,2993},{1237,7169},{1237,2032},{1237,4401},{1239,1938},{1239,3407},{1241,8791},{1242,6765},{1243,2409},{1243,4526},{1246,4985},{1247,9419},{1249,9358},{1249,7187},{1250,7555},{1250,8397},{1250,7197},{1250,6421},{1250,1483},{1250,7191},{1251,8945},{1251,780},{1252,7128},{1254,7362},{1254,8962},{1255,1899},{1255,3767},{1256,7914},{1258,5644},{1258,8779},{1259,9335},{1259,912},{1260,3030},{1260,4676},{1260,2724},{1261,3727},{1262,4321},{1262,4189},{1263,8426},{1264,6538},{1265,4408},{1266,1822},{1267,4701},{1268,3832},{1269,6271},{1271,6581},{1272,5372},{1273,4437},{1273,9911},{1274,8305},{1274,8306},{1275,6355},{1276,221},{1276,3372},{1278,1738},{1280,1077},{1280,901},{1280,6911},{1280,1699},{1282,1297},{1282,2395},{1283,498},{1285,5977},{1286,8637},{1288,1151},{1290,5495},{1291,7184},{1291,8451},{1293,8998},{1294,2618},{1294,7225},{1296,7435},{1298,9306},{1299,4269},{1299,9084},{1299,6367},{1301,9313},{1302,7464},{1305,4700},{1305,8484},{1306,3765},{1307,5110},{1308,6215},{1308,2430},{1309,1031},{1310,1256},{1313,1740},{1316,9922},{1316,1541},{1316,5726},{1316,8455},{1317,225},{1317,4818},{1319,1783},{1319,9456},{1321,5191},{1323,1709},{1324,1439},{1324,646},{1325,1126},{1326,4675},{1327,9051},{1328,1089},{1329,5095},{1330,102},{1330,7058},{1331,847},{1332,6215},{1333,7403},{1334,3532},{1336,5948},{1337,3097},{1339,739},{1339,4100},{1340,4285},{1340,8868},{1341,7758},{1343,1086},{1343,3995},{1344,3279},{1344,9508},{1344,5552},{1344,5595},{1346,5006},{1347,3502},{1349,1480},{1349,1885},{1351,6897},{1352,5978},{1353,8708},{1353,965},{1353,8831},{1355,9133},{1356,9387},{1356,9383},{1359,8003},{1360,2496},{1362,1433},{1363,4874},{1363,651},{1363,9774},{1364,4263},{1366,3156},{1368,7399},{1370,4747},{1370,2254},{1373,1928},{1373,1775},{1378,4847},{1378,1388},{1379,5714},{1380,1618},{1380,390},{1380,1490},{1381,9535},{1382,1650},{1383,2177},{1385,4152},{1386,2771},{1387,1054},{1387,449},{1388,9958},{1388,706},{1389,5151},{1390,1357},{1390,1992},{1393,9704},{1393,5613},{1394,1909},{1394,3734},{1395,3940},{1396,4056},{1397,9866},{1399,1212},{1399,7106},{1399,2866},{1399,3536},{1400,9798},{1402,9451},{1403,4608},{1404,5200},{1405,5512},{1405,1559},{1408,2285},{1409,3475},{1409,8603},{1409,7363},{1410,749},{1411,7211},{1411,7558},{1411,6794},{1413,9388},{1413,7031},{1414,4610},{1417,5666},{1419,5490},{1420,20},{1420,3643},{1421,3422},{1421,7571},{1422,8374},{1422,4898},{1425,2555},{1425,59},{1427,2308},{1427,2036},{1428,5410},{1429,9940},{1429,8807},{1429,4335},{1430,2986},{1436,965},{1437,8262},{1438,5953},{1438,9892},{1439,9900},{1439,7340},{1439,8718},{1441,6694},{1441,4241},{1442,7536},{1442,4778},{1442,5237},{1442,6923},{1443,7020},{1444,4843},{1444,4883},{1445,9287},{1445,6384},{1446,1667},{1448,4372},{1448,8963},{1448,5206},{1449,4260},{1450,427},{1453,6829},{1454,1580},{1454,4720},{1456,4707},{1456,7682},{1457,1057},{1458,4560},{1458,8832},{1458,7135},{1460,789},{1464,8990},{1464,6325},{1465,7322},{1466,3849},{1466,575},{1467,5124},{1470,3304},{1472,6397},{1472,325},{1473,3683},{1474,7035},{1474,1423},{1477,1681},{1477,4941},{1478,3573},{1480,6871},{1480,1692},{1480,2003},{1482,3228},{1484,6490},{1484,5631},{1484,2177},{1485,8282},{1485,4224},{1488,5036},{1488,9834},{1491,2974},{1492,3813},{1492,6769},{1493,8843},{1494,2146},{1495,4129},{1495,7341},{1495,5346},{1495,1985},{1496,7115},{1496,4780},{1497,3696},{1498,7927},{1498,2530},{1498,1760},{1498,1634},{1501,6072},{1502,9540},{1503,5317},{1504,6917},{1504,6968},{1504,1977},{1505,2930},{1505,6509},{1506,7577},{1507,8028},{1507,2988},{1508,1313},{1508,6836},{1509,4305},{1509,8083},{1510,2306},{1511,8569},{1512,885},{1512,5694},{1512,7329},{1513,9734},{1513,157},{1514,3578},{1515,9883},{1517,7868},{1519,5916},{1521,5861},{1523,2967},{1525,4787},{1525,4892},{1525,760},{1525,982},{1526,183},{1526,4831},{1528,5434},{1530,7677},{1531,1709},{1531,464},{1531,6635},{1531,5801},{1532,8564},{1534,6023},{1536,1356},{1539,2261},{1539,3241},{1539,2120},{1539,8618},{1542,2812},{1547,4843},{1548,6662},{1548,3478},{1549,3773},{1549,7507},{1550,5950},{1550,7614},{1550,9706},{1551,6945},{1551,5862},{1551,1806},{1552,7265},{1553,5548},{1553,8170},{1555,9343},{1557,421},{1560,2605},{1560,8209},{1561,9296},{1561,8496},{1562,5081},{1564,5100},{1564,4360},{1564,9691},{1566,9232},{1567,8838},{1569,4594},{1572,4324},{1572,6185},{1574,6406},{1576,4306},{1576,6383},{1578,9064},{1579,9945},{1581,927},{1581,264},{1583,9254},{1586,1542},{1587,7646},{1588,8660},{1589,4091},{1591,472},{1592,3071},{1594,6986},{1595,6127},{1596,8571},{1596,6930},{1596,5638},{1599,3575},{1603,2202},{1603,996},{1603,8755},{1603,1412},{1605,3666},{1606,1941},{1606,8424},{1608,9168},{1608,2095},{1611,1594},{1611,5912},{1611,8286},{1613,1585},{1613,3138},{1614,3855},{1615,9523},{1616,4448},{1616,7634},{1617,6907},{1617,4755},{1618,1618},{1619,7253},{1621,7030},{1623,3925},{1623,9158},{1626,323},{1628,5145},{1630,9484},{1633,725},{1633,8763},{1633,4729},{1635,95},{1635,6304},{1636,1884},{1636,7521},{1636,9334},{1637,481},{1638,1203},{1640,4112},{1641,5507},{1642,7441},{1642,3709},{1644,8917},{1644,5635},{1645,2707},{1646,3316},{1646,5691},{1646,3930},{1647,7457},{1647,8553},{1650,8230},{1651,4683},{1651,149},{1655,657},{1656,304},{1659,7775},{1660,6876},{1660,9219},{1660,3527},{1661,7505},{1661,6704},{1661,3926},{1664,9955},{1664,3234},{1666,4372},{1669,9527},{1670,6222},{1672,3602},{1673,7103},{1674,5962},{1675,4071},{1675,7906},{1676,7728},{1677,266},{1678,6029},{1678,7087},{1678,691},{1679,2295},{1680,4039},{1681,8755},{1681,2243},{1682,6150},{1682,4158},{1682,713},{1682,8818},{1686,6898},{1686,1730},{1686,7778},{1687,8679},{1687,7410},{1687,5172},{1689,8770},{1693,4015},{1693,805},{1694,8161},{1695,2851},{1697,8885},{1697,2771},{1699,4956},{1700,8739},{1700,3927},{1701,7327},{1702,8246},{1703,1698},{1706,8249},{1708,8704},{1709,2784},{1709,7873},{1710,9451},{1710,7420},{1713,5317},{1713,6631},{1713,964},{1713,8514},{1714,1836},{1715,573},{1715,5802},{1718,5011},{1719,9621},{1719,6477},{1720,651},{1722,7924},{1724,857},{1724,3133},{1724,6730},{1728,4880},{1730,8520},{1730,248},{1731,8772},{1735,9063},{1735,3131},{1736,1959},{1736,4082},{1740,8553},{1740,8140},{1741,8678},{1741,7073},{1744,1116},{1744,1352},{1745,7292},{1746,8649},{1746,8435},{1747,7023},{1747,39},{1748,6794},{1749,8937},{1751,2571},{1753,3463},{1756,5847},{1759,8379},{1761,4924},{1761,4820},{1762,5145},{1763,9386},{1764,6068},{1764,5385},{1764,1048},{1766,5583},{1766,3830},{1766,5252},{1767,5407},{1768,83},{1769,7225},{1770,9648},{1770,2649},{1771,2730},{1771,745},{1772,1212},{1774,5611},{1776,9550},{1776,6077},{1777,1922},{1777,3902},{1779,6408},{1779,2331},{1779,2212},{1780,5754},{1782,8631},{1782,6510},{1786,7180},{1788,2337},{1788,1307},{1788,118},{1789,9748},{1789,4265},{1790,8856},{1796,7584},{1797,3183},{1797,8774},{1798,3325},{1798,2572},{1800,7713},{1801,3417},{1802,1429},{1803,3768},{1803,7508},{1805,8443},{1806,3013},{1806,7089},{1807,5199},{1807,2973},{1810,8491},{1811,207},{1811,5722},{1813,3798},{1813,5496},{1816,4668},{1820,8573},{1822,4972},{1823,627},{1829,6114},{1829,247},{1830,6505},{1830,6293},{1832,1416},{1833,6202},{1835,1645},{1836,6694},{1836,8472},{1836,7035},{1839,5523},{1839,1777},{1840,5267},{1840,3475},{1840,3386},{1841,1049},{1841,4263},{1843,5413},{1843,2568},{1844,9474},{1847,8809},{1847,2176},{1848,2365},{1849,3224},{1850,4670},{1850,2188},{1850,5055},{1851,2617},{1851,7574},{1852,8914},{1855,7802},{1855,2920},{1855,2887},{1856,9232},{1856,7064},{1864,4967},{1864,749},{1868,4862},{1870,6254},{1871,6698},{1871,3612},{1874,3522},{1874,8749},{1875,9772},{1876,3900},{1877,9105},{1878,7046},{1878,2795},{1880,9220},{1880,7779},{1881,5860},{1882,2150},{1883,9562},{1883,4115},{1883,2997},{1884,3564},{1884,25},{1884,6415},{1885,6955},{1885,148},{1885,1118},{1887,1419},{1887,6689},{1888,667},{1888,234},{1888,8855},{1889,466},{1890,2517},{1891,559},{1891,5696},{1893,8924},{1897,1619},{1898,9315},{1899,8214},{1899,7391},{1900,8384},{1901,9297},{1902,3382},{1902,4635},{1904,2286},{1905,2200},{1906,387},{1909,1490},{1912,6368},{1912,5806},{1913,2339},{1914,2154},{1915,9617},{1917,2827},{1920,6818},{1920,1992},{1924,463},{1925,8333},{1928,7817},{1931,4692},{1933,253},{1934,2945},{1935,2429},{1935,5613},{1938,3769},{1939,4494},{1941,2010},{1941,6626},{1942,8717},{1943,6615},{1944,4225},{1947,9974},{1948,6780},{1950,2970},{1951,7097},{1952,6353},{1954,2312},{1954,5967},{1957,1017},{1958,7142},{1958,6080},{1960,8189},{1960,4016},{1962,373},{1965,6085},{1968,7893},{1973,8278},{1973,8645},{1973,6221},{1974,6858},{1974,6453},{1975,7937},{1977,3072},{1979,9820},{1981,2691},{1982,8607},{1982,9369},{1984,2290},{1985,9055},{1986,9088},{1987,7201},{1994,8381},{1999,5405},{2003,9765},{2003,7585},{2004,4716},{2004,6538},{2007,329},{2008,1998},{2008,5585},{2008,380},{2009,863},{2009,7422},{2009,7666},{2009,3608},{2010,2974},{2011,7980},{2013,1064},{2013,557},{2015,1389},{2015,2257},{2017,9667},{2017,7082},{2018,5424},{2020,7602},{2021,6224},{2024,3662},{2025,3008},{2028,3596},{2029,3617},{2030,5007},{2031,1590},{2032,4975},{2033,9080},{2033,6133},{2034,4140},{2034,6927},{2034,7876},{2035,6449},{2035,9646},{2035,6005},{2035,2382},{2036,6046},{2037,6773},{2038,4488},{2039,3420},{2039,8310},{2040,3215},{2041,8450},{2042,7836},{2044,2333},{2045,1695},{2046,9366},{2047,9757},{2049,7106},{2050,7442},{2051,5131},{2051,8495},{2052,6596},{2053,5821},{2053,888},{2054,7214},{2055,8118},{2055,4624},{2056,5190},{2057,4090},{2057,5061},{2057,4086},{2057,7760},{2057,6223},{2058,1729},{2060,9780},{2061,9854},{2062,214},{2062,6200},{2063,643},{2063,2962},{2064,2519},{2064,4764},{2065,9048},{2066,5736},{2067,5599},{2068,4411},{2068,6044},{2068,1093},{2070,4414},{2073,2844},{2074,3486},{2077,1150},{2077,8907},{2077,9284},{2078,8368},{2080,5296},{2084,5694},{2084,2638},{2085,764},{2085,7904},{2086,7233},{2087,2404},{2088,4468},{2088,3272},{2089,9606},{2092,1809},{2094,3379},{2095,1742},{2096,3238},{2096,9274},{2096,7497},{2097,1216},{2097,1715},{2100,4360},{2102,5602},{2103,4928},{2103,7580},{2104,4148},{2104,6304},{2104,2507},{2105,8947},{2106,8042},{2109,6342},{2112,8556},{2112,1699},{2112,6246},{2113,9670},{2116,2174},{2116,2863},{2117,8273},{2118,5678},{2118,8389},{2119,2473},{2121,5728},{2124,1730},{2124,8842},{2125,9345},{2126,8927},{2129,7559},{2129,816},{2130,2853},{2132,5949},{2132,8659},{2133,6023},{2134,1358},{2136,2972},{2136,541},{2138,9592},{2139,251},{2139,9177},{2140,3085},{2141,9789},{2142,4709},{2143,7072},{2144,9352},{2145,9970},{2145,2224},{2147,9764},{2148,8739},{2149,7058},{2150,6903},{2151,3113},{2152,1631},{2152,8503},{2152,2959},{2153,2945},{2153,9712},{2154,2837},{2155,272},{2155,908},{2155,4316},{2157,2728},{2157,7833},{2157,465},{2158,2513},{2160,4505},{2160,6770},{2160,5632},{2162,8827},{2163,963},{2164,8774},{2164,391},{2165,4411},{2166,1512},{2168,8726},{2169,928},{2170,1930},{2172,6519},{2173,8579},{2175,7763},{2177,6149},{2177,4124},{2178,5052},{2178,4021},{2180,5183},{2181,2529},{2182,2077},{2184,3197},{2188,752},{2188,6369},{2189,9826},{2189,2665},{2190,7660},{2191,6524},{2191,5658},{2194,2809},{2196,4044},{2199,5151},{2199,39},{2201,4495},{2202,9505},{2202,5221},{2203,657},{2203,3151},{2204,157},{2204,6233},{2205,5195},{2205,491},{2205,4068},{2207,5717},{2208,6656},{2211,1099},{2215,5674},{2215,3314},{2216,4477},{2216,8364},{2218,7315},{2218,3528},{2219,5236},{2219,1130},{2221,5482},{2221,2940},{2222,3041},{2222,1478},{2224,2321},{2224,3053},{2224,9415},{2225,77},{2226,8388},{2226,746},{2226,8234},{2227,7876},{2227,4511},{2228,6902},{2230,9231},{2230,1565},{2232,1102},{2232,8671},{2232,4926},{2232,9625},{2233,7317},{2233,5927},{2236,8326},{2240,9140},{2240,6062},{2241,6179},{2241,9927},{2244,20},{2245,8471},{2245,9995},{2246,1887},{2247,4983},{2248,1319},{2248,3368},{2249,6343},{2249,4463},{2249,7848},{2251,4879},{2253,9947},{2253,3915},{2254,5231},{2256,8697},{2256,2930},{2257,2306},{2257,1440},{2257,8701},{2257,4479},{2258,8803},{2259,3326},{2260,6847},{2262,9404},{2263,372},{2263,3208},{2264,7806},{2265,1784},{2267,1099},{2267,6366},{2268,6773},{2269,6053},{2271,8136},{2272,4871},{2273,9155},{2275,6185},{2275,6778},{2277,7292},{2280,3890},{2283,5470},{2284,1896},{2286,5399},{2286,4564},{2287,7229},{2290,8795},{2290,1049},{2292,7326},{2292,5390},{2299,134},{2300,9142},{2301,7844},{2301,7463},{2301,8285},{2303,7280},{2305,9244},{2306,845},{2306,4169},{2308,6312},{2308,3313},{2308,8509},{2309,418},{2309,4864},{2311,7013},{2314,5281},{2314,486},{2315,8468},{2315,525},{2315,1487},{2315,5048},{2316,94},{2316,9714},{2317,2743},{2317,245},{2317,5807},{2318,4175},{2319,8640},{2319,2893},{2320,2236},{2320,7867},{2321,5017},{2322,4179},{2322,7439},{2322,8128},{2322,7632},{2324,2355},{2325,5276},{2329,8673},{2330,7986},{2331,6745},{2331,9129},{2332,7598},{2333,5680},{2335,3175},{2336,7211},{2337,3691},{2337,6447},{2339,4751},{2339,9824},{2340,3438},{2340,9612},{2342,9623},{2342,5243},{2343,989},{2343,649},{2343,1190},{2343,5792},{2345,9662},{2346,5158},{2347,14},{2347,4097},{2348,1183},{2349,6228},{2350,6743},{2351,4951},{2352,3483},{2353,9385},{2354,6275},{2354,908},{2356,6276},{2357,552},{2359,1278},{2362,1058},{2362,638},{2363,1728},{2370,4750},{2371,6183},{2371,5379},{2374,8203},{2374,308},{2374,409},{2375,852},{2376,9907},{2376,3512},{2376,9862},{2377,5138},{2378,4034},{2378,9745},{2380,5601},{2384,9258},{2385,2628},{2386,1937},{2389,9371},{2389,559},{2390,6246},{2392,6656},{2393,497},{2394,1175},{2394,7830},{2395,334},{2396,377},{2398,2728},{2400,9928},{2404,897},{2404,1342},{2406,8540},{2407,4913},{2408,3995},{2411,7580},{2411,621},{2412,8792},{2412,2045},{2413,9064},{2413,6278},{2413,5719},{2415,6434},{2415,1344},{2420,135},{2420,1645},{2422,3862},{2423,7068},{2424,3606},{2424,9974},{2424,4750},{2425,6972},{2425,4354},{2426,1751},{2428,3579},{2429,2630},{2430,4018},{2430,8542},{2430,9254},{2432,5137},{2432,1034},{2433,9559},{2435,5722},{2435,72},{2437,6393},{2438,5575},{2438,6032},{2439,136},{2439,6856},{2442,6882},{2447,1597},{2448,9392},{2450,2536},{2451,6580},{2451,1518},{2454,4338},{2455,3073},{2456,3404},{2456,1817},{2457,7848},{2458,5540},{2459,7289},{2461,9809},{2462,8208},{2463,2094},{2464,6148},{2466,2363},{2466,1449},{2467,6751},{2468,9253},{2469,4691},{2469,3738},{2470,1528},{2470,3352},{2471,2952},{2473,9929},{2474,6266},{2474,4138},{2476,1476},{2477,3021},{2479,1501},{2482,4362},{2483,9769},{2483,4893},{2490,6976},{2493,8313},{2493,1295},{2493,6709},{2495,9556},{2497,8916},{2498,7932},{2498,1441},{2499,8465},{2499,3960},{2500,4848},{2500,9413},{2501,9064},{2501,6423},{2501,9087},{2502,915},{2503,3762},{2504,5269},{2504,8883},{2504,1883},{2505,899},{2506,5527},{2507,3533},{2508,578},{2509,6752},{2509,8219},{2509,2478},{2510,2078},{2511,7334},{2511,3933},{2513,3397},{2513,6158},{2513,9246},{2515,9274},{2516,3298},{2516,8372},{2518,9766},{2519,4258},{2519,5318},{2519,4350},{2520,6646},{2521,5358},{2522,136},{2523,3602},{2523,7871},{2523,2513},{2525,2279},{2527,8200},{2527,9532},{2527,1543},{2528,559},{2529,2149},{2531,7118},{2532,5489},{2533,1146},{2534,182},{2535,7025},{2535,326},{2536,1521},{2536,7818},{2537,1928},{2540,6720},{2541,1769},{2541,4327},{2541,436},{2542,1601},{2543,3878},{2544,7795},{2544,8169},{2544,5147},{2545,8035},{2545,8491},{2545,335},{2546,655},{2548,470},{2548,9516},{2549,8731},{2549,3369},{2550,5579},{2550,9942},{2550,8808},{2552,1112},{2554,91},{2554,2307},{2555,8947},{2556,5427},{2557,6865},{2558,250},{2559,1841},{2560,3542},{2560,4636},{2560,2232},{2561,4074},{2562,993},{2565,1029},{2565,2859},{2566,4942},{2570,1015},{2572,8436},{2573,6519},{2573,2649},{2573,6287},{2573,2113},{2576,5119},{2577,1047},{2578,9378},{2579,3286},{2579,2217},{2579,8723},{2580,113},{2580,4646},{2581,672},{2582,8188},{2583,3638},{2583,5470},{2585,4805},{2586,40},{2587,5007},{2587,6495},{2588,6810},{2590,3283},{2592,3560},{2592,7745},{2592,9123},{2592,7012},{2592,858},{2592,9219},{2593,9528},{2595,3828},{2595,4089},{2595,7441},{2595,6158},{2597,1317},{2597,6187},{2598,8272},{2598,5278},{2599,308},{2600,1624},{2600,5430},{2602,6687},{2603,5461},{2604,1594},{2604,8858},{2604,9942},{2605,6783},{2606,5233},{2607,625},{2608,2490},{2610,9571},{2610,7443},{2613,5689},{2617,3728},{2619,9583},{2619,2881},{2620,6883},{2620,5184},{2621,4264},{2622,4977},{2622,2824},{2623,4834},{2624,398},{2625,4985},{2626,887},{2626,2619},{2628,3345},{2630,2745},{2630,1711},{2630,3283},{2630,3486},{2630,2933},{2631,7541},{2632,7362},{2632,2016},{2633,296},{2634,5726},{2635,44},{2635,6666},{2636,1057},{2636,9306},{2636,1629},{2638,1411},{2639,4811},{2640,8601},{2640,9474},{2642,8786},{2643,1018},{2644,7417},{2645,1464},{2646,5501},{2646,6282},{2647,5594},{2652,7554},{2653,9411},{2653,1781},{2653,7380},{2653,864},{2654,9617},{2656,8283},{2656,2935},{2658,3513},{2664,6874},{2665,9719},{2668,4619},{2669,8064},{2670,1242},{2674,6387},{2674,8318},{2675,8092},{2677,9473},{2677,2746},{2677,4092},{2679,2373},{2680,9535},{2680,1979},{2681,320},{2681,8572},{2681,7499},{2682,9713},{2682,1528},{2685,5811},{2686,1219},{2687,3214},{2687,7003},{2688,3438},{2688,5721},{2688,8459},{2689,6955},{2690,6691},{2691,6053},{2691,7933},{2691,2495},{2691,5270},{2692,5176},{2694,9975},{2694,5274},{2695,4836},{2695,1502},{2695,2802},{2696,2801},{2697,7557},{2698,2141},{2700,6978},{2700,7431},{2701,7892},{2702,6543},{2703,4581},{2705,4261},{2705,7191},{2706,9750},{2707,9230},{2707,727},{2708,3744},{2708,9750}};
        System.out.println(averageWaitingTime.averageWaitingTime(customers));
    }
}