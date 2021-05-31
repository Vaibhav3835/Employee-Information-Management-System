-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 30, 2021 at 11:34 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `admindb`
--

-- --------------------------------------------------------

--
-- Table structure for table `admindetails`
--

CREATE TABLE `admindetails` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `Uid` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admindetails`
--

INSERT INTO `admindetails` (`username`, `password`, `Uid`) VALUES
('admin', '123', 'Admin2020');

-- --------------------------------------------------------

--
-- Table structure for table `a_to_e_feedback`
--

CREATE TABLE `a_to_e_feedback` (
  `eid` varchar(10) NOT NULL,
  `Workspace` int(2) NOT NULL,
  `leadingskills` int(2) NOT NULL,
  `DevelopingApproach` int(2) NOT NULL,
  `Teamworking` int(2) NOT NULL,
  `Overall` int(2) NOT NULL,
  `remark` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `a_to_e_feedback`
--

INSERT INTO `a_to_e_feedback` (`eid`, `Workspace`, `leadingskills`, `DevelopingApproach`, `Teamworking`, `Overall`, `remark`) VALUES
('19BCS3832', 5, 8, 6, 5, 5, 'Nice work!!'),
('19BCS3833', 4, 7, 6, 6, 8, 'Nice Work'),
('19BCS3835', 6, 6, 3, 8, 7, 'Yes well done'),
('19BCS3843', 2, 4, 5, 3, 6, 'Average');

-- --------------------------------------------------------

--
-- Table structure for table `empfeedback`
--

CREATE TABLE `empfeedback` (
  `eid` varchar(10) NOT NULL,
  `campusManage` int(2) NOT NULL,
  `workspace` int(2) NOT NULL,
  `growth` int(2) NOT NULL,
  `Workhome` int(2) NOT NULL,
  `overall` int(2) NOT NULL,
  `emptext` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `empfeedback`
--

INSERT INTO `empfeedback` (`eid`, `campusManage`, `workspace`, `growth`, `Workhome`, `overall`, `emptext`) VALUES
('19BCS3835', 3, 6, 6, 6, 7, 'Felling Good'),
('19BCS3843', 3, 5, 3, 4, 7, 'Very good environment');

-- --------------------------------------------------------

--
-- Table structure for table `empleave`
--

CREATE TABLE `empleave` (
  `Sno` int(11) NOT NULL,
  `EmpID` varchar(20) NOT NULL,
  `Ename` varchar(40) NOT NULL,
  `Type` varchar(40) NOT NULL,
  `FDate` varchar(40) NOT NULL,
  `TDate` varchar(50) NOT NULL,
  `Days` int(4) NOT NULL,
  `Reason` varchar(100) NOT NULL,
  `Request` varchar(40) DEFAULT 'Peding'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `empleave`
--

INSERT INTO `empleave` (`Sno`, `EmpID`, `Ename`, `Type`, `FDate`, `TDate`, `Days`, `Reason`, `Request`) VALUES
(98, '19BCS3843', 'Iktaj', 'Medical', 'Dec 14, 2020', 'Dec 15, 2020', 1, 'Fever', 'Pending'),
(99, '19BCS3843', 'Iktaj', 'Personal', 'Dec 18, 2020', 'Dec 20, 2020', 2, 'Marriage', 'Pending'),
(100, '19BCS3832', 'Sougata', 'Medical', 'Dec 12, 2020', 'Dec 14, 2020', 2, 'Cough', 'Approved'),
(101, '19BCS3832', 'Sougata', 'Personal', 'Dec 21, 2020', 'Dec 23, 2020', 2, 'Marriage', 'Pending'),
(102, '19BCS3835', 'Vaibhav', 'Medical', 'Dec 11, 2020', 'Dec 12, 2020', 1, 'Cough', 'Pending'),
(103, '19BCS3835', 'Vaibhav', 'Personal', 'Dec 14, 2020', 'Dec 18, 2020', 4, 'Marriage', 'Pending'),
(104, '19BCS3833', 'Ashish Kumar', 'Personal', 'Dec 24, 2020', 'Dec 26, 2020', 3, 'Marriage', 'Pending'),
(105, '19BCS3833', 'Ashish Kumar', 'Medical', 'Dec 17, 2020', 'Dec 18, 2020', 1, 'Cough', 'Pending'),
(106, '19BCS3832', 'Sougata', 'Personal', 'Dec 18, 2020', 'Dec 19, 2020', 1, 'Marriage', 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `employeedetails`
--

CREATE TABLE `employeedetails` (
  `empid` varchar(10) NOT NULL,
  `epassword` varchar(10) NOT NULL,
  `empName` varchar(50) NOT NULL,
  `Dept` varchar(50) NOT NULL,
  `Education` varchar(50) NOT NULL,
  `CurrentProject` varchar(30) NOT NULL,
  `EmployeeSkills` varchar(20) NOT NULL,
  `language` varchar(15) NOT NULL,
  `ContactNo` varchar(10) NOT NULL,
  `EmailAdd` varchar(50) NOT NULL,
  `Doj` varchar(30) NOT NULL,
  `House_add` varchar(50) NOT NULL,
  `Salary` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employeedetails`
--

INSERT INTO `employeedetails` (`empid`, `epassword`, `empName`, `Dept`, `Education`, `CurrentProject`, `EmployeeSkills`, `language`, `ContactNo`, `EmailAdd`, `Doj`, `House_add`, `Salary`) VALUES
('19BCS3832', 's123', 'Sougata', 'Marketing', 'MBA', 'EIMS', 'Fluent English', 'English', '34353434', 'sougata@gmail', '4 Nov 2020', 'America', 500000),
('19BCS3833', 'a123', 'Ashish Kumar', 'Cse', 'Btech', 'Auto Door', 'Java (Swing)', 'Java,C++', '12343554', 'asy@gmail', '12 Nov 2020', 'Ch. Dadri', 300000),
('19BCS3835', 'v123', 'Vaibhav', 'Developer', 'Btech', 'Auto Door', 'Java swing, C++', 'Java,C++', '24423452', 'adfadsfaf@gmail', '14 Nov 2020', 'Mahendergrah,Hry.', 200000),
('19BCS3843', 'i123', 'Iktaj', 'cse', 'Btech', 'EIMS', 'Java Swing', 'Java, C++', '12343235', 'ik23@gmail', 'h', 'Chandigrah', 400000);

-- --------------------------------------------------------

--
-- Table structure for table `payroll`
--

CREATE TABLE `payroll` (
  `Eid` varchar(20) NOT NULL,
  `empName` varchar(40) NOT NULL,
  `Salary` int(20) NOT NULL,
  `Basic` int(20) NOT NULL,
  `HRA` int(20) NOT NULL,
  `Conveyence` int(20) NOT NULL,
  `PF` int(20) NOT NULL,
  `ESI` int(20) NOT NULL,
  `Tax` int(20) NOT NULL,
  `Net Salary` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payroll`
--

INSERT INTO `payroll` (`Eid`, `empName`, `Salary`, `Basic`, `HRA`, `Conveyence`, `PF`, `ESI`, `Tax`, `Net Salary`) VALUES
('19BCS3832', 'Sougata', 500000, 300000, 100000, 100000, 30000, 35000, 40000, 395000),
('19BCS3833', 'Ashish Kumar', 300000, 180000, 60000, 60000, 18000, 21000, 15000, 246000),
('19BCS3835', 'Vaibhav', 200000, 120000, 40000, 40000, 12000, 14000, 10000, 164000),
('19BCS3843', 'Iktaj', 400000, 240000, 80000, 80000, 24000, 28000, 32000, 316000);

-- --------------------------------------------------------

--
-- Table structure for table `projectdetails`
--

CREATE TABLE `projectdetails` (
  `PID` varchar(10) NOT NULL,
  `PName` varchar(50) NOT NULL,
  `PStart` varchar(30) NOT NULL,
  `PEnd` varchar(30) NOT NULL,
  `PMemberID` varchar(30) NOT NULL,
  `PMember` varchar(30) NOT NULL,
  `PDescription` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `projectdetails`
--

INSERT INTO `projectdetails` (`PID`, `PName`, `PStart`, `PEnd`, `PMemberID`, `PMember`, `PDescription`) VALUES
('p2', 'eims', '2 nov', '23 nov', '19BCS3832', 'Sougata', 'Mangement'),
('p1', 'auto door', '10 nov', '30 nov', '19BCS3833', 'Ashish', 'New Tech'),
('p1', 'auto door', '10 nov', '30 nov', '19BCS3835', 'Vaibhav', 'New Tech'),
('p2', 'eims', '2 nov', '23 nov', '19BCS3843', 'Iktaj', 'Mangement');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admindetails`
--
ALTER TABLE `admindetails`
  ADD PRIMARY KEY (`password`),
  ADD UNIQUE KEY `uid` (`Uid`);

--
-- Indexes for table `a_to_e_feedback`
--
ALTER TABLE `a_to_e_feedback`
  ADD PRIMARY KEY (`eid`);

--
-- Indexes for table `empfeedback`
--
ALTER TABLE `empfeedback`
  ADD PRIMARY KEY (`eid`);

--
-- Indexes for table `empleave`
--
ALTER TABLE `empleave`
  ADD PRIMARY KEY (`Sno`),
  ADD UNIQUE KEY `Sno` (`Sno`);

--
-- Indexes for table `employeedetails`
--
ALTER TABLE `employeedetails`
  ADD PRIMARY KEY (`empid`),
  ADD UNIQUE KEY `epassword` (`epassword`);

--
-- Indexes for table `payroll`
--
ALTER TABLE `payroll`
  ADD PRIMARY KEY (`Eid`);

--
-- Indexes for table `projectdetails`
--
ALTER TABLE `projectdetails`
  ADD PRIMARY KEY (`PMemberID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `empleave`
--
ALTER TABLE `empleave`
  MODIFY `Sno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=108;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `a_to_e_feedback`
--
ALTER TABLE `a_to_e_feedback`
  ADD CONSTRAINT `fk_eid` FOREIGN KEY (`eid`) REFERENCES `employeedetails` (`empid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
