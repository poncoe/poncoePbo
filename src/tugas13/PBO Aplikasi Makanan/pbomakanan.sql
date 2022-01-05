-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Waktu pembuatan: 18 Des 2021 pada 21.24
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbomakanan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `makananfav`
--

CREATE TABLE `makananfav` (
  `id` int(100) NOT NULL,
  `name` varchar(250) NOT NULL,
  `jenis` varchar(250) NOT NULL,
  `rating` int(10) NOT NULL,
  `kalori` int(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `makananfav`
--

INSERT INTO `makananfav` (`id`, `name`, `jenis`, `rating`, `kalori`) VALUES
(3, 'Mie', 'Makanan Instant', 1, 1),
(4, 'Sayur', 'Makanan Sehat', 3, 0),
(5, 'Indomie', 'Makanan Instant', 1, 12);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `makananfav`
--
ALTER TABLE `makananfav`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `makananfav`
--
ALTER TABLE `makananfav`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
